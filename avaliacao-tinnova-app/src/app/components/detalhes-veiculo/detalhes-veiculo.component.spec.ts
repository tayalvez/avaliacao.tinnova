import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetalhesVeiculoComponent } from './detalhes-veiculo.component';

describe('DetalhesVeiculoComponent', () => {
  let component: DetalhesVeiculoComponent;
  let fixture: ComponentFixture<DetalhesVeiculoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DetalhesVeiculoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DetalhesVeiculoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
