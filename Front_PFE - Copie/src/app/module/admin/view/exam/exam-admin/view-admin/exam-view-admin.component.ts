import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {ExamService} from 'src/app/controller/service/Exam.service';
import {ExamDto} from 'src/app/controller/model/Exam.model';
import {ExamCriteria} from 'src/app/controller/criteria/ExamCriteria.model';

import {ExamGradeDto} from 'src/app/controller/model/ExamGrade.model';
import {ExamGradeService} from 'src/app/controller/service/ExamGrade.service';
import {SemesterDto} from 'src/app/controller/model/Semester.model';
import {SemesterService} from 'src/app/controller/service/Semester.service';
import {ModuleDto} from 'src/app/controller/model/Module.model';
import {ModuleService} from 'src/app/controller/service/Module.service';
import {StudentDto} from 'src/app/controller/model/Student.model';
import {StudentService} from 'src/app/controller/service/Student.service';
@Component({
  selector: 'app-exam-view-admin',
  templateUrl: './exam-view-admin.component.html'
})
export class ExamViewAdminComponent extends AbstractViewController<ExamDto, ExamCriteria, ExamService> implements OnInit {

    examGrades = new ExamGradeDto();
    examGradess: Array<ExamGradeDto> = [];

    constructor(private examService: ExamService, private examGradeService: ExamGradeService, private semesterService: SemesterService, private moduleService: ModuleService, private studentService: StudentService){
        super(examService);
    }

    ngOnInit(): void {
        this.examGrades.student = new StudentDto();
        this.studentService.findAll().subscribe((data) => this.students = data);
        this.module = new ModuleDto();
        this.moduleService.findAll().subscribe((data) => this.modules = data);
        this.semester = new SemesterDto();
        this.semesterService.findAll().subscribe((data) => this.semesters = data);
    }


    get student(): StudentDto {
       return this.studentService.item;
    }
    set student(value: StudentDto) {
        this.studentService.item = value;
    }
    get students():Array<StudentDto> {
       return this.studentService.items;
    }
    set students(value: Array<StudentDto>) {
        this.studentService.items = value;
    }
    get module(): ModuleDto {
       return this.moduleService.item;
    }
    set module(value: ModuleDto) {
        this.moduleService.item = value;
    }
    get modules():Array<ModuleDto> {
       return this.moduleService.items;
    }
    set modules(value: Array<ModuleDto>) {
        this.moduleService.items = value;
    }
    get semester(): SemesterDto {
       return this.semesterService.item;
    }
    set semester(value: SemesterDto) {
        this.semesterService.item = value;
    }
    get semesters():Array<SemesterDto> {
       return this.semesterService.items;
    }
    set semesters(value: Array<SemesterDto>) {
        this.semesterService.items = value;
    }


}
