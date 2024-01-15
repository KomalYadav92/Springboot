package com.example.service;

import com.example.entity.Manager;
import com.example.model.ManagerDTO;

public interface ManagerService {
ManagerDTO createManager(Manager manager);
String assignEmployeeToManager(int empId,int mId);
}
