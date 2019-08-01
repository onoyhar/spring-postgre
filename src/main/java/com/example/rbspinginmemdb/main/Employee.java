package com.example.rbspinginmemdb.main;

public class Employee {
	String id;
	String status;
	String project;
	int tanggal;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String name) {
		this.status = status;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public int getTanggal() { return tanggal; }
	public void setTanggal(int salary) { this.tanggal = tanggal; }
	@Override
	public String toString() {
		return String.format("Pilot Of Technology [id=%s, status=%s, project=%s, tanggal=%s]", id, status, project, tanggal);
	}
	
	
}
