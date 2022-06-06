import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CalcscreenComponent } from './calcscreen.component';

describe('CalcscreenComponent', () => {
  let component: CalcscreenComponent;
  let fixture: ComponentFixture<CalcscreenComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CalcscreenComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CalcscreenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
