package org.OurTime.Controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.OurTime.DTO.GalleryAttachDTO;
import org.OurTime.Controller.UploadController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/brdUpload")
public class UploadController {
	private static final Logger logger=LoggerFactory.getLogger(UploadController.class);
	
	@RequestMapping(value="/uploadForm",method=RequestMethod.GET)
	public String getUploadform() {
		System.out.println("abcd");
		return "/board/uploadForm";
	}
	
	private String getFolder() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();									
		String str = sdf.format(date);

		return str.replace("-",File.separator);
	}
	
	@RequestMapping(value="/uploadFormAction",method=RequestMethod.POST)
	public ResponseEntity<ArrayList<GalleryAttachDTO>> postUpload(MultipartFile[] uploadFile) {
	
		System.out.println("uploadFormAction");
		
		ArrayList<GalleryAttachDTO> attlist = new ArrayList<>();

		String uploadFolder="D:\\uploadFolder";			//upload경로
		String uploadFolderPath=getFolder();

			File uploadPath = new File(uploadFolder, uploadFolderPath);
			
				if(uploadPath.exists()==false) {
					uploadPath.mkdirs();
			}
			System.out.println("file="+uploadFile.length);
			for(MultipartFile files : uploadFile) {
				GalleryAttachDTO attach = new GalleryAttachDTO();
				String uploadFileName = files.getOriginalFilename();
				
				attach.setFileName(uploadFileName);
			
			//**UUID(Universally Unique IDentify)
			UUID uuid = UUID.randomUUID();
			logger.info("uuid="+uuid);
			uploadFileName=uuid.toString()+"_"+files.getOriginalFilename();	
			
			try {
				File saveFile = new File(uploadPath,uploadFileName);
				logger.info("saveFile="+saveFile);
				files.transferTo(saveFile);
				attach.setUploadPath(uploadFolderPath);
				attach.setUuid(uuid.toString());
				
				
				attlist.add(attach);
				logger.info("attlist="+attlist);
			}catch(Exception e) {
				e.getMessage();
			}
			
			}//
			return new ResponseEntity<>(attlist,HttpStatus.OK);
	}//uploadFormAction 
	
	@RequestMapping(value="/display",method=RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<byte[]> getFiles(String fileName){
		File file = new File("D:\\uploadFolder\\"+fileName);	//upload경로
		ResponseEntity<byte[]> result=null;
		
		try {
			HttpHeaders header = new HttpHeaders();
			header.add("Content-Type", Files.probeContentType(file.toPath()));
			result = new ResponseEntity<>(FileCopyUtils.copyToByteArray(file),
					header, HttpStatus.OK);
		}catch(IOException e) {
			e.printStackTrace();
		}
			return result;
	}
}
