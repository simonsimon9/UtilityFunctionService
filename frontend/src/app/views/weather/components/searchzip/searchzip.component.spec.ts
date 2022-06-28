import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchzipComponent } from './searchzip.component';

describe('SearchzipComponent', () => {
  let component: SearchzipComponent;
  let fixture: ComponentFixture<SearchzipComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SearchzipComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchzipComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
