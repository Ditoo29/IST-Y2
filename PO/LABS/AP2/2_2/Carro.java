/*
----------------------------
Carro
----------------------------
- _marca:String
- _quilometragem:int
- _v_max:int
- _pneus:Pneu[]
- _travado:boolean
- _velocidade:int
----------------------------
+ Carro(marca:String, v_max:int, p1:Pneu, p2:Pneu, p3:Pneu, p4:Pneu)
+ obtem_marca():String
+ obtem_v_max():int
+ pneus_vazios():boolean
+ altera_quilometragem(nova_km:int):void
+ trava(): void
+ destrava(): void
+ altera_velocidade(nova_velocidade:int):void
----------------------------
 */

public class Carro{

    private String _marca;
    private int _quilometragem;
    private int _v_max;
    private Pneu[] _pneus;
    private boolean _travado;
    private int _velocidade;

    public Carro(String marca, int v_max, Pneu p1, Pneu p2, Pneu p3, Pneu p4){
        _quilometragem = 0;
        _marca = marca;
        _v_max = v_max;
        _pneus = new Pneu[4];
        _pneus[0] = p1;
        _pneus[1] = p2;
        _pneus[2] = p3;
        _pneus[3] = p4;
        _travado = true;
        _velocidade = 0;
    }

    public String obtem_marca(){
        return _marca;
    }

    public int obtem_v_max(){
        return _v_max;
    }

    public boolean pneus_vazios(){
        int i;

        for (i=0; i< _pneus.length; i++){
            if ( _pneus[i].esta_vazio()){
                return true;
            }
        }
        return false;
    }

    public void altera_quilometragem(int nova_km){
        _quilometragem = nova_km;
    }

    public void trava(){
        if (!_travado){
            _velocidade = 0;
            _travado = true;
        }
    }

    public void destrava(){
        if (_travado){
            _travado = false;
        }
    }

    public void altera_velocidade(int nova_v){
        if (!_travado){
            if (nova_v <= _v_max){
                _velocidade = nova_v;
            }
        }
    }

}