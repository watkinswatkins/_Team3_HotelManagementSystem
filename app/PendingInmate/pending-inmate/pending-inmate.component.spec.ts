import { ComponentFixture, TestBed } from '@angular/core/testing';
aa
import { PendingInmateComponent } from './pending-inmate.component';

describe('PendingInmateComponent', () => {
  let component: PendingInmateComponent;
  let fixture: ComponentFixture<PendingInmateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PendingInmateComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PendingInmateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
