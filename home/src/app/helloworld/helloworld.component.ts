import { Component, OnInit } from '@angular/core';
import {User} from '../user';

@Component({
  selector: 'app-helloworld',
  templateUrl: './helloworld.component.html',
  styleUrls: ['./helloworld.component.css']
})
export class HelloworldComponent implements OnInit {

  user: User = {
    name: 'World' //user's name is World by default
  };

  constructor() { }

  ngOnInit() {
  }

}
