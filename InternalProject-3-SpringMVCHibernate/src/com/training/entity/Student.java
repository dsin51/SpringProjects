package com.training.entity;

public class Student {
	private int studentId;
	private String name;
	private String dept;
	private int marksExam;
	private int marksEvents;
	private int marksSports;
	private int marksActivities;
	private double totalMarks;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String name, String dept, int marksExam, int marksEvents, int marksSports,
			int marksActivities) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.dept = dept;
		this.marksExam = marksExam;
		this.marksEvents = marksEvents;
		this.marksSports = marksSports;
		this.marksActivities = marksActivities;
		this.totalMarks = calculateTotal();
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getMarksExam() {
		return marksExam;
	}

	public void setMarksExam(int marksExam) {
		this.marksExam = marksExam;
	}

	public int getMarksEvents() {
		return marksEvents;
	}

	public void setMarksEvents(int marksEvents) {
		this.marksEvents = marksEvents;
	}

	public int getMarksSports() {
		return marksSports;
	}

	public void setMarksSports(int marksSports) {
		this.marksSports = marksSports;
	}

	public int getMarksActivities() {
		return marksActivities;
	}

	public void setMarksActivities(int marksActivities) {
		this.marksActivities = marksActivities;
	}

	private double calculateTotal() {
		return ((marksExam * 0.5) + (marksEvents * 0.1) + (marksSports * 0.2) + (marksActivities * 0.2));
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", dept=" + dept + ", marksExam=" + marksExam
				+ ", marksEvents=" + marksEvents + ", marksSports=" + marksSports + ", marksActivities="
				+ marksActivities + ", totalMarks=" + totalMarks + "]";
	}

}
