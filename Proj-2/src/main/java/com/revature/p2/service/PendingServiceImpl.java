package com.revature.p2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


import com.revature.p2.model.Pending;
import com.revature.p2.model.Pending.status;
import com.revature.p2.repository.PendingRepository;

@Service

public class PendingServiceImpl {
	
	private PendingRepository pendingService;

public List<Pending> findAll() {
		
		return pendingService.findAll();
		
	}


public List<Pending> findStatus(status status) {
		
	switch (status) {

    case PENDING:

        List<Pending> penPending = findAll();

        List<Pending> pending = new ArrayList<>();

        for (Pending inmate : penPending) {

            if (inmate.getStatus().equals(status.PENDING)) {

                pending.add(inmate);

            }

        }

        return pending;

    case APPROVED:

        List<Pending> appPending = findAll();

        List<Pending> approved = new ArrayList<>();

        if (appPending == null) {

            System.out.println("There are no inmates in this cell block!");

            break;

        }

        for (Pending inmate : appPending) {

            if (inmate.getStatus().equals(status.APPROVED)) {

                approved.add(inmate);

            }
        }

        return approved;

    case DENIED:

        List<Pending> denPending = findAll();

        List<Pending> denied = new ArrayList<>();

        if (denPending == null) {

            System.out.println("There are no inmates in this cell block!");

            break;

        }

        for (Pending inmate : denPending) {

            if (inmate.getStatus().equals(status.DENIED)) {

                denied.add(inmate);

            }
        }

        return denied;

    }

    return null;


		
	//	return null;	
	
}
public Pending addPending(Pending pending) {
	
	return pendingService.save(pending);
	
}

}