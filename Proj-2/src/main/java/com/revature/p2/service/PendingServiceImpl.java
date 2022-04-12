package com.revature.p2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.revature.p2.model.Pending;
//import com.revature.p2.model.Pending.status;
import com.revature.p2.repository.PendingRepository;

@Service
public class PendingServiceImpl {
	
	@Autowired
	private PendingRepository pendingService;
	

public List<Pending> findAll() {
		
		return pendingService.findAll();
		
	}


//public List<Pending> findStatus(String status) {
//		
//	String stat = status.toUpperCase();
//	
//	switch (stat) {
//
//    case "PENDING":
//
//        List<Pending> penPending = findAll();
//
//        List<Pending> pending = new ArrayList<>();
//
//        for (Pending inmate : penPending) {
//
//            if (inmate.getStatus().equals(stat)) {
//
//                pending.add(inmate);
//
//            }
//
//        }
//
//        return pending;
//        //System.out.println(pending);
//
//
//    case "APPROVED":
//
//        List<Pending> appPending = findAll();
//
//        List<Pending> approved = new ArrayList<>();
//
//        if (appPending == null) {
//
//            System.out.println("There are no inmates in this cell block!");
//
//            break;
//
//        }
//
//        for (Pending inmate : appPending) {
//
//            if (inmate.getStatus().equals(stat)) {
//
//                approved.add(inmate);
//
//            }
//        }
//
//        return approved;
//        //System.out.println(approved);
//
//
//    case "DENIED":
//
//        List<Pending> denPending = findAll();
//
//        List<Pending> denied = new ArrayList<>();
//
//        if (denPending == null) {
//
//            System.out.println("There are no inmates in this cell block!");
//
//            break;
//
//        }
//
//        for (Pending inmate : denPending) {
//
//            if (inmate.getStatus().equals(stat)) {
//
//                denied.add(inmate);
//
//            }
//        }
//
//        return denied;
//        
////        System.out.println(denied);
//
//    }
//
//
//
//		
//	return null;	
//	
//}

public Pending addPending(Pending pending) {
	
	return pendingService.save(pending);
	
}



public List<Pending> findByStatusContaining(String status) {
	// TODO Auto-generated method stub
//	return pendingService.findByStatusContaining(status);
	
	List<Pending> pending = findAll();
	
	List<Pending> result = new ArrayList<>();
	
	for(Pending pend : pending) {
		
		String val = status;
		String val1 = pend.getStatus();
		
		if (val.equalsIgnoreCase(val1)) {
			
			result.add(pend);
			
		}
		
	}
	
	return result;
}

}