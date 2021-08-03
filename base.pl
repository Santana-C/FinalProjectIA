hipotesis(coronavirus):-
    sintoma(tos),
    sintoma(fiebre_alta),
    sintoma(diarrea),
    sintoma(dolor_muscular),
    sintoma(dolor_de_cabeza),
    sintoma(dolor_de_garganta),
    (sintoma(perdida_olfato); sintoma(perdida_gusto);sintoma(problemas_respiratorios)).

hipotesis(gripe):-
    sintoma(tos),
    sintoma(fiebre_alta),
    sintoma(diarrea),
    sintoma(dolor_muscular),
    sintoma(dolor_de_cabeza),
    sintoma(dolor_de_garganta).

hipotesis(resfriado):-
    sintoma(tos),
    sintoma(estornudo),
    sintoma(escurrimiento_nasal),
    sintoma(dolor_de_garganta).

hipotesis(alergia):-
    sintoma(estornudo),
    sintoma(escurrimiento_nasal),
    sintoma(ojos_irritados),
    sintoma(dolor_de_garganta).