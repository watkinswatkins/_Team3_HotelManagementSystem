import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserListComponent } from './user-list/user-list.component';
import { UserFormComponent } from './user-form/user-form.component';
import { LoginFormComponent } from './login-form/login-form.component';
import { InmateFormComponent } from './inmate-form/inmate-form.component';

const routes: Routes = [
  
  { path: 'users/login', component: LoginFormComponent},
  { path: 'users', component: UserListComponent },
  { path: 'users/addUser', component: UserFormComponent },
  { path: 'inmates/', component: InmateFormComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }