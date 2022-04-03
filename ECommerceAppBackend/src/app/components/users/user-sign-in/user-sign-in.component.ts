import { Component, OnInit } from '@angular/core';
import {User} from '../../../models/User';
import {Router} from '@angular/router';

@Component({
  selector: 'app-user-sign-in',
  templateUrl: './user-sign-in.component.html',
  styleUrls: ['./user-sign-in.component.scss']
})
export class UserSignInComponent implements OnInit {

  title = 'ECommerceApp';
  loginInvalid: any;
  user: User = {userId: 0, email: '', password: '', firstName: '', lastName: ''};
  // tslint:disable-next-line:typedef
  onSubmit() {
    console.log(this.user.email, this.user.password);
    this.router.navigate(['/home']);
  }
  constructor(private router: Router) {
  }

  ngOnInit(): void {
    console.log('Entered');
  }

}
