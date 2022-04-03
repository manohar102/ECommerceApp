import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {UserSignInComponent} from './components/users/user-sign-in/user-sign-in.component';
import {UserSignUpComponent} from './components/users/user-sign-up/user-sign-up.component';
import {HomeComponent} from './home/home.component';
import {ProductDetailsComponent} from './components/products/ProductDetailsComponent/product-details.component';
import {OrderDetailsComponent} from './components/orders/OrderDetailsComponent/order-details.component';

const routes: Routes = [
  {path: '', redirectTo: '/login', pathMatch: 'full'},
  {path: 'login', component: UserSignInComponent},
  {path: 'signup', component: UserSignUpComponent},
  {path: 'products' , component: ProductDetailsComponent},
  {path: 'orders', component: OrderDetailsComponent},
  {path: 'home', component: HomeComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
