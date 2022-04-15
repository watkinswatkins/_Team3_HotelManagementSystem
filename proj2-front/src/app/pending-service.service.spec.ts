import { TestBed } from '@angular/core/testing';

import { PendingServiceService } from './pending-service.service';

describe('PendingServiceService', () => {
  let service: PendingServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PendingServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
