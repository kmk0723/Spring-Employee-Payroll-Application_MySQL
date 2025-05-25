package com.example.sql;

import java.util.List;

public interface Iempser {

	List<empdata> empinfo();

	String empid(int id);

	void addid(empdata newid);

	void updatid(int id, empdata upid);

	void deleteid(int id);

}
