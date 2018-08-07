package com.ZeMoSo.assignment.employeeManager.bootstrap;

import com.ZeMoSo.assignment.employeeManager.datasource.Designation;
import com.ZeMoSo.assignment.employeeManager.repository.DesignationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DesignationStrap implements CommandLineRunner {
    @Autowired
    private DesignationRepository mDesignationRepository;

    @Override
    public void run(String... args) throws Exception {
        Designation ceo = new Designation();
        ceo.setDesignation("Ceo");
        ceo.setRank(Rank.CEO);
        mDesignationRepository.save(ceo);

        Designation manager = new Designation();
        manager.setDesignation("Manager");
        manager.setRank(Rank.MANAGER);
        mDesignationRepository.save(manager);

        Designation hr = new Designation();
        hr.setDesignation("Hr");
        hr.setRank(Rank.HR);
        mDesignationRepository.save(hr);
        Designation softwarengineer = new Designation();
        softwarengineer.setDesignation("Softwarengineer");
        softwarengineer.setRank(Rank.SOFTWAREENGINEER);
        mDesignationRepository.save(softwarengineer);
    }

    public static class Rank {
        public static final int CEO = 4;
        public static final int MANAGER = 3;
        public static final int HR = 2;
        public static final int SOFTWAREENGINEER = 1;

    }
}