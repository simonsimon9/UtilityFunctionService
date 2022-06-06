import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TinyurlOutputComponent } from './tinyurl-output.component';

describe('TinyurlOutputComponent', () => {
  let component: TinyurlOutputComponent;
  let fixture: ComponentFixture<TinyurlOutputComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TinyurlOutputComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TinyurlOutputComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
