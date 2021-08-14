import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';


import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { HomeComponent } from './home/home.component';
import { CartComponent } from './cart/cart.component';
import { CourseComponent } from './course/course.component';
import { AddcourseComponent } from './addcourse/addcourse.component';
import { ContactusComponent } from './contactus/contactus.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { ForgetpasswordComponent } from './forgetpassword/forgetpassword.component';
import { DeletecourseComponent } from './deletecourse/deletecourse.component';
import { EditcourseComponent } from './editcourse/editcourse.component';
import { AppRoutingModule } from './app-routing.module';
import { RouterModule, Routes } from '@angular/router';
import { TrainerprofileComponent } from './trainerprofile/trainerprofile.component';
import { StudentprofileComponent } from './studentprofile/studentprofile.component'
const routes: Routes = []



@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    HomeComponent,
    CartComponent,
    CourseComponent,
    AddcourseComponent,
    ContactusComponent,
    AboutusComponent,
    ForgetpasswordComponent,
    DeletecourseComponent,
    EditcourseComponent,
    TrainerprofileComponent,
    StudentprofileComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
