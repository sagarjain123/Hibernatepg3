package com.om.sai.test;

import com.om.sai.dao.InstititueDAO;
import com.om.sai.dto.InstititueDTO;

public class Tester {
	
	public static void main(String[] args)
	{
		InstititueDTO instititueedto=new InstititueDTO();
		instititueedto.setInstituteid(123);
		instititueedto.setInstitutename("kct");
		instititueedto.setInstituteplace("bellary");
		instititueedto.setInstitutefee(70000.00);
		
		InstititueDAO instititueedao=new InstititueDAO();
		instititueedao.updateInstititue(instititueedto);
		System.out.println("save data");
				
	}

}
