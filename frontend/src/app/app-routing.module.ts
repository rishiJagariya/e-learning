import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { TrainerprofileComponent } from './trainerprofile/trainerprofile.component';
import { RegisterComponent } from './register/register.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { LoginComponent } from './login/login.component';
import { EditcourseComponent } from './editcourse/editcourse.component';
import { AddcourseComponent } from './addcourse/addcourse.component';
import { DeletecourseComponent } from './deletecourse/deletecourse.component';
import { CartComponent } from './cart/cart.component';
import { ContactusComponent } from './contactus/contactus.component';
import { ForgetpasswordComponent } from './forgetpassword/forgetpassword.component';
import { CourseComponent } from './course/course.component';
import { StudentprofileComponent } from './studentprofile/studentprofile.component';

const routes:Routes=[

  {path: 'home', component: HomeComponent},
  {path: 'register', component: RegisterComponent},
  {path: 'aboutus', component: AboutusComponent},
  {path: 'login', component:LoginComponent},
  {path: 'cart', component:CartComponent },
  {path: 'contactus', component:ContactusComponent },
  {path: 'forgetpassword', component:ForgetpasswordComponent },
  {path: 'course', component:CourseComponent},
  {path: 'trainerprofile', component:TrainerprofileComponent,
   children : [
    {path: 'addcourse', component: AddcourseComponent},
    {path: 'deletecourse', component: DeletecourseComponent},
    {path: 'editcourse', component: EditcourseComponent}
  ]},
  {path: 'studentprofile',component:StudentprofileComponent}
]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
  
export class AppRoutingModule { }
export const routingComponents = [
  LoginComponent,
  AboutusComponent,
  CartComponent,
  AddcourseComponent,
  ContactusComponent,
  CourseComponent,
  DeletecourseComponent,
  EditcourseComponent,
  ForgetpasswordComponent,
  HomeComponent,
  StudentprofileComponent,
  TrainerprofileComponent,
  RegisterComponent
]