import { Component, OnInit } from '@angular/core';
import {User} from '../../../models/User';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-user-sign-up',
  templateUrl: './user-sign-up.component.html',
  styleUrls: ['./user-sign-up.component.scss']
})
export class UserSignUpComponent implements OnInit {
  title = 'ECommerceApp';
  form: FormGroup ;
  public loginInvalid = false;
  public registrationCompleted = false;
  private hasErrors = true;
  user: User = {userId: 0, email: '', password: '', firstName: '', lastName: ''};
  // tslint:disable-next-line:typedef
  onSubmit() {
    console.log(this.form.value);

  }
  constructor(private fb: FormBuilder) {
    this.form = this.fb.group({
      firstName: [],
      lastName : [],
      email : [],
      password: [],
      confirmPassword : []
    });
  }

  ngOnInit(): void {
  }

}
