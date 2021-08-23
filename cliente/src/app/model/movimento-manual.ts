import { ProdutoCosif } from "./produto-cosif";
import { Produto } from "./produto";

export class MovimentoManual {

    mes?: number ;
    ano?: number ;
    idProduto?: Produto;
    idCosif?: ProdutoCosif;
    descricao?: string;
    valor?: number


    static fromJson(json: any): MovimentoManual {
        return Object.assign(new MovimentoManual(), json);
    }
}
