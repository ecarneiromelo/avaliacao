export class MovimentoManual {

    mes?: number ;
    ano?: number ;

    static fromJson(json: any): MovimentoManual {
        return Object.assign(new MovimentoManual(), json);
    }
}
