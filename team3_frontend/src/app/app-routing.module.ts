import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { GuardBlockComponent } from './guard/guard-block/guard-block.component';
import { GuardInmateComponent } from './guard/guard-inmate/guard-inmate.component';
import { GuardComponent } from './guard/guard.component';

const routes: Routes = [
  {path: '', component: GuardComponent},
  {path: '', component: GuardBlockComponent},
  {path: '', component: GuardInmateComponent},
  {path: '', component: }
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
