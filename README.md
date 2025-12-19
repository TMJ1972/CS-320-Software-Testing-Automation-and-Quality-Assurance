CS-320 Software Testing, Automation, and QA Portfolio
Overview

This repository contains the completed artifacts for CS-320 Software Test, Automation, and Quality Assurance. The projects demonstrate the design and testing of backend services using Java and JUnit, with a focus on requirement-driven unit testing, test coverage, and professional testing practices.

The repository includes implementation code, unit tests, and written analysis documenting the testing approach, effectiveness, and professional mindset applied throughout the course.

Project One: Unit Testing for Backend Services
Project Description

Project One involved developing and testing three backend services for a mobile application: Contact Service, Task Service, and Appointment Service. Each service was implemented using in-memory data structures and verified exclusively through JUnit tests. No database or user interface was required.

The primary objective was to ensure that all functional and validation requirements were enforced through code and verified through automated unit tests 

Project One Guidelines and Rubr…

.

Services Implemented
Contact Service

Implements a Contact object with strict field validation

Supports adding, deleting, and updating contacts by unique contact ID

Enforces constraints on ID length, name length, phone number format, and address length

Fully verified using JUnit tests for both valid and invalid input scenarios

Task Service

Implements a Task object with required fields and validation rules

Supports adding, deleting, and updating tasks by unique task ID

Enforces limits on task name and description length

Verified using unit tests that confirm correct behavior and error handling

Appointment Service

Implements an Appointment object with validation on ID, date, and description

Prevents appointments from being scheduled in the past

Supports adding and deleting appointments by appointment ID

Verified through JUnit tests covering boundary cases and invalid inputs

Testing Approach

Unit tests were written to directly align with the stated software requirements. Each requirement was validated using positive and negative test cases to confirm both expected functionality and proper rejection of invalid data.

JUnit test coverage for all Java files meets or exceeds the required 80 percent threshold, demonstrating the effectiveness and completeness of the test suite 

Project One Guidelines and Rubr…

.

Technologies Used

Java

JUnit

Eclipse IDE

In-memory data structures

Automated unit testing

Project Two: Summary and Reflections on Software Testing
Project Description

Project Two consists of a formal summary and reflections report analyzing the unit testing strategies used in Project One. The report evaluates how testing approaches were selected based on requirements, the effectiveness of the resulting tests, and the professional mindset applied during testing.

This project emphasizes analytical thinking, testing discipline, and reflection on quality assurance practices 

Project Two Guidelines and Rubr…

.

Topics Addressed

Alignment of unit tests to software requirements

Evaluation of test effectiveness using coverage metrics

Techniques used to ensure technically sound and efficient test code

Discussion of testing techniques employed and those not used

Reflection on caution, bias reduction, and professional discipline in software testing

Consideration of long-term quality and avoidance of technical debt

Skills Demonstrated

Requirement-driven test design

Automated unit testing with JUnit

Code validation and defensive programming

Test coverage analysis

Technical reflection and professional QA mindset

Clear technical communication

Repository Structure

ContactService/
Contact.java
ContactService.java
ContactTest.java
ContactServiceTest.java

TaskService/
Task.java
TaskService.java
TaskTest.java
TaskServiceTest.java

AppointmentService/
Appointment.java
AppointmentService.java
AppointmentTest.java
AppointmentServiceTest.java

ProjectTwo/
Summary and Reflections Report (Word document)

Author

Todd Jarmiolowski
Computer Science Student
