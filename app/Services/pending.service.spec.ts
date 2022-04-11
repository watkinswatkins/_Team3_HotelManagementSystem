import { TestBed } from '@angular/core/testing';
aa
import { PendingService } from './pending.service';

describe('PendingService', () => {
  let service: PendingService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PendingService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
