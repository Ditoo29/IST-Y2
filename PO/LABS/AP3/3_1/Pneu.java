/*
----------------------------------
Pneu
----------------------------------
- _pressao_ar:int
- _pressao_ar_rec:int
- _furado:boolean
----------------------------------
+ Pneu(pressao_ar:int, pressao_ar_rec:int)
+ obtem_pressao_ar():int
+ obtem_pressao_ar_rec():int
+ esta_vazio():boolean
+ altera_pressao(nova_pressao:int):void
+ esta_furado():boolean
----------------------------------
 */

public class Pneu{

    private int _pressao_ar;
    private int _pressao_ar_rec;
    private boolean _furado;

    public Pneu(int pressao_ar, int pressao_ar_rec){
        _pressao_ar = pressao_ar;
        _pressao_ar_rec = pressao_ar_rec;
        _furado = false;
    }

    public int obtem_pressao(){
        return _pressao_ar;
    }

    public int obtem_pressao_ar_rec(){
        return _pressao_ar_rec;
    }

    public boolean esta_vazio(){
        return _pressao_ar < 0.8 * _pressao_ar_rec;
    }

    public void altera_pressao(int nova_pressao){
        if (!_furado){
            if(nova_pressao > 1.5*_pressao_ar_rec){
                _pressao_ar = 0;
                _furado = true;
            }else{
                _pressao_ar = nova_pressao;
            }
        }
    }

    public boolean esta_furado(){
        return _furado;
    }
}