import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Product} from '../models/Product';
import {Observable} from 'rxjs';
import {map} from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private server = "http://127.0.0.1:8080/";
  httpOptions = {};
  constructor(private httpClient: HttpClient) {
  }
  getProducts(): Observable<Product[]>
  {
    const url = `${this.server}products/get`;
    return this.httpClient.get<Product[]>(url, this.httpOptions)
      .pipe(
        map((data: any) => {
          return data;
        }));
  }
}
