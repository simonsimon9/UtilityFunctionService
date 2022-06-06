import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CalcbtnComponent } from './calcbtn.component';

describe('CalcbtnComponent', () => {
  let component: CalcbtnComponent;
  let fixture: ComponentFixture<CalcbtnComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CalcbtnComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CalcbtnComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
