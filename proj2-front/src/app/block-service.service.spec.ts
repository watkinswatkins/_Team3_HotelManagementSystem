import { TestBed } from '@angular/core/testing';

import { BlockServiceService } from './block-service.service';

describe('BlockServiceService', () => {
  let service: BlockServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BlockServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
