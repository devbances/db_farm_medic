package com.example.dbfarmmedic.DataMedic;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MedicsDbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "MedicsData.db";

    public MedicsDbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + MedicsContract.MedicsEntry.TABLE_NAME +"("
                + MedicsContract.MedicsEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + MedicsContract.MedicsEntry.ID + " TEXT NOT NULL,"
                + MedicsContract.MedicsEntry.AVATAR_URI + " TEXT ,"
                + MedicsContract.MedicsEntry.GROUP_MEDICS + " TEXT NOT NULL,"

                + MedicsContract.MedicsEntry.NAME_GENERIC + " TEXT NOT NULL,"
                + MedicsContract.MedicsEntry.NAME_ECOMERCE + " TEXT NOT NULL,"
                + MedicsContract.MedicsEntry.PRESENTATION + " TEXT NOT NULL,"

                + MedicsContract.MedicsEntry.GROUP_FARMACO + " TEXT NOT NULL,"
                + MedicsContract.MedicsEntry.GROUP_TERAPICS + " TEXT NOT NULL,"
                + MedicsContract.MedicsEntry.RISK_PREGNANCY + " TEXT NOT NULL,"

                + MedicsContract.MedicsEntry.MECANICS_ACTION + " TEXT NOT NULL,"

                + MedicsContract.MedicsEntry.CYCLE_LIFE + " TEXT NOT NULL,"
                + MedicsContract.MedicsEntry.ABSORTION + " TEXT NOT NULL,"
                + MedicsContract.MedicsEntry.DISTRIBUTION + " TEXT NOT NULL,"
                + MedicsContract.MedicsEntry.METABOLIC + " TEXT NOT NULL,"
                + MedicsContract.MedicsEntry.EXCRETION + " TEXT NOT NULL,"

                + MedicsContract.MedicsEntry.INDICATIONS + " TEXT NOT NULL,"

                + MedicsContract.MedicsEntry.CONTRADICTIONS + " TEXT NOT NULL,"

                + MedicsContract.MedicsEntry.CV + " TEXT NOT NULL,"
                + MedicsContract.MedicsEntry.DERMA + " TEXT NOT NULL,"
                + MedicsContract.MedicsEntry.GI + " TEXT NOT NULL,"
                + MedicsContract.MedicsEntry.NEURO + " TEXT NOT NULL,"
                + MedicsContract.MedicsEntry.GU + " TEXT NOT NULL,"
                + MedicsContract.MedicsEntry.ORL + " TEXT NOT NULL,"
                + MedicsContract.MedicsEntry.OTHERS + " TEXT NOT NULL,"

                + MedicsContract.MedicsEntry.CARE_NURSING + " TEXT NOT NULL,"
                + MedicsContract.MedicsEntry.INTERACTION_MEDICS + " TEXT NOT NULL,"

                + "UNIQUE (" + MedicsContract.MedicsEntry.ID + "))");
        mockData(db);
    }

    private void mockData(SQLiteDatabase sqLiteDatabase){
        mockLawyer(sqLiteDatabase, new MedicsData("1", "antibioticos.jpg","Azitromicina","ZITROMAX, TRI AZIT","AZITROMICINA: Cáp. 250mg, Comp. 500mg, Susp. Oral 1g, Susp. Oral 200mg/5ml, Susp. Oral 250mg/5ml, Susp. Oral 500mg/5ml, vial 500mg.",
                "Macrólido azálido.","Antibiótico","B","Se une a la subunidad 50S de los ribosomas 70S de los mircoorganismos bacterianos sensibles, inhibiendo la síntesis de proteínas. Es bactericida frente a S. pyogenes, Spneumoniae, y H. influenzae. Resulta bacteriostático con estafilococos y aerobios Gram negativos.",
                "Dosis única 11 a 14 h, dosis múltiple 2 a 4 días.", "Rápida en el TGI, los alimentos disminuyen su absorción y su concentración sérica máxima en un 52%.","Amplia y alcanza el estado de equilibrio en 5 a 7 días con una concentración mínima. Se distribuye intracelularmente a nivel de fagocitos fibroblastos, de esta manera es transportado al sitio de infección donde se libera gradualmente. Se encuentra en mayores concentraciones en pulmón, esputo, amígdalas y cérvix. Se difunde en hueso, fluido seminal, próstata, ovarios, útero, trompas, estómago, hígado y versícula. Tiene concentraciones bajas en el LCR. Unión a proteínas plasmáticas 7 a 50%.",
                "Hepático por desmetilación 25%.", "Biliar 50% como agente inalterado, renal 4,5% en 3 días.","Exacerbaciones de bronquitis bacteriana, faringitis estreptocócica o neumonía por S. pneumoniae o H. Influenzae, infecciones dérmicas y de tejidos blandos no complicadas.\n" +
                "Exacerbaciones bacterianas agudas de enfermedad pulmonar obstructiva crónica.\n", "Hipersensibilidad a la Azitromicina u otros macrólidos. No usar simultáneamente con derivados del cornezuelo de centeno.","Palpitaciones, dolor torácico.", "Rash, fotosensibilidad.",
                "Dolor abdominal, diarrea, náuseas, vómitos, dispepsia, flatulencia, ictericia, hemorragia GI.","Cefalea, mareo, vértigo, somnolencia.", "Nefritis intersticial aguda, candidiasis, vaginitis.",
                "Hipoacusia reversible neurosensorial.","Hipersensibilidad, disnea, angioedema.","Antiácidos: disminuyen la concentración plasmática de Azitromicina en un 24%.\n" +
                "Digoxina: eleva los niveles séricos de Digoxina.\n" +
                "Ergotamina o Dihidroergotamina: puede generar ergotismo agudo caracterizado por vasoespasmo periférico severo y disestesia.\n" +
                "\uF0FC\tCarbamazepina, Ciclosporina y Fenitoína:\n","Administrar 1h previa o 2 h siguientes a las comidas, salvo indicación contraria del fabricante."));

        mockLawyer(sqLiteDatabase, new MedicsData("1", "antibioticos.jpg","Claritromicina","KLARICID","CLARITROMICINA: Tab. 250mg y 500mg, Tab. Retard 500mg, Susp. Oral 125 mg/5ml y 250mg/5ml, Vía EV 500mg.",
                "Macrólido","Antibiótico","C","Macrólido bacteriostático y bactericida según sus concentraciones plasmáticas. se une en forma reversible a la subunidad 50S de los ribosomas bacterianos, bloqueando la unión de ARNt al lugar donador, inhibiendo la síntesis de proteínas. El espectro incluye: Staphylococcus aureus sensible a Meticilina. Streptococcus Pneumoniae, S. agalactiae. ",
                "3,3 h +_ 30 min.", "Rápida en el TGI, los alimentos no disminuyen el grado de absorción, pero si la velocidad de la misma, así como la formación del metabolito activo.","Unión a proteínas plasmáticas 65 a 75%. Nivel de equilibrio en 2 a 3 días. Se obtienen mayores concentraciones en mucosa nasal, amígdalas y pulmones que en sangre. Presenta concentraciones intracelulares elevadas penetrando fácilmente en leucocitos y macrófagos. Se excreta en leche materna.",
                "Hepático, el principal metabolito activo es el 14-OH Claritromicina.", "Renal 20 a 30% como agente inalterado, como metabolito activo 10 a 15%, y vía fecal 4%. ","\uF0FC\tBronquitis bacteriana por H. influenzae.\n" +
                "\u2713\t Exacerbaciones de bronquitis bacteriana por otros microorganismos susceptibles.\n" +
                "\u2713\t Neumonía por S. Pneumoniae o M. Pneumoniae.\n" +
                "\u2713\t Faringitis estreptocócica.\n" +
                "\u2713\t Sinusitis maxilar aguda.\n" +
                "\u2713\t Otitis media aguda.\n" +
                "\u2713\t Infecciones de la piel y de tejido blando.\n" +
                "\u2713\t Infecciones moderadas a graves.\n", "\uF0FC\tHipersensibilidad a la Claritromicina u otros macrólidos. No administrar junto a Terfenadina en pacientes con trastornos de conducción cardiaca, coronariopatía, ICC o trastornos hidroelectrolíticos. Embarazo.","Flebitis, arritmias.", "Rash, urticaria, síndrome de Stevens- Johnson.","Anomalías del gusto, dolor abdominal, diarrea, náuseas, estomatitis y glositis, hepatitis, ictericia colestásica, colitis seudomembranosa, dispepsia, vómitos.",
                "Cefalea, ansiedad, mareo, vértigo, despersonalización, insomnio, alucinaciones, confusión, pesadillas.", " ", "Perdida de la audición, tinnitus.","Superinfecciones micóticas o bacterianas.","\uF0FC\tTeofilina y carbamazepina, ciclosporina, barbitúricos, fenitoína, Alfentanilo, lovastatina, bromocriptina, valproato, cisaprida, astemizol: puede elevar los niveles séricos de estos fármacos.\n" +
                "\uF0FC\tTerfenadina: riesgo de efectos adversos severos incluyendo arritmias cardiacas.\n" +
                "\uF0FC\tZidovudina: puede disminuirlos niveles séricos de Zidovudina.\n" +
                "\uF0FC\tAnticoagulantes orales: puede potenciar el efecto anticoagulante.\n" +
                "\uF0FC\tDigoxina: pueden elevarse los niveles séricos de digoxina.\n" +
                "\uF0FC\tErgotamina o Dihidroergotamina: riesgo de toxicidad aguda, vasoespasmo periférico severo y disestesia.\n","\uF0FC\tLa VO puede administrarse con las comidas o sin alimentos.\n" +
                "\uF0FC\t Administrar la vía EV en 60 min diluyendo inicialmente con agua estéril y posteriormente con dextrosa al 5% o suero salino normal.\n" +
                "\uF0FC\tNo administrar en bolo o IM.\n"));

        mockLawyer(sqLiteDatabase, new MedicsData("1", "antibioticos.jpg",
                "Eritromicina ",
                " Erylan, Eritromin, Ilosone, Pantomicina, Pantogram, Selvicin",
                " Eritromicina: Cáp:250mg, Tab: 500mg, Susp. Oral. 125mg/5ml, Susp. Oral.  250mg/5ml.",
                " Macrólido azálido.",
                "Antibiótico ",
                " Categoría FDA: B",
                " Macrólido bacteriostático y bactericida según sus concentraciones plasmáticas. Se une en forma reversible a la subunidad 50S de los ribosomas bacterianos, bloqueando la unión de ARNt al lugar donador, inhibiendo la síntesis de proteínas.",
                "96 min +_ 42 min.",
                "Variablemente en TGI según la sal administrada. La Eritromicina base es sensible a la acidez gástrica. Las sales ácidas y los ésteres no son afectados por el Ph del estómago. Los alimentos disminuyen la absorción de la base y del estearato, pero no afectan al estolato ni al etilsuccinato. ",
                " Las mayores concentraciones son en hígado, bilis y bazo. Mantiene niveles adecuados en líquidos pleural y ascítico. En líquido prostático y seminal son el 33% de la concentración sérica. Penetra inadecuadamente el CLR y es variable en oído medio. En plasma fetal alcanza 5 a 20% del nivel sérico materno, se excreta en leche materna. El 80% de la Eritromicina base y el 96% del estolato se unen en proteínas plasmáticas.",
                "Hepático como agente libre, parcial a metabolitos inactivos, las sales se hidrolizan en el TGI. ",
                "Hepática, vía renal 12%+_ 7% como agente inalterado por filtración glomerular. ",
                "\uF0FC\tInfecciones por microorganismos susceptibles.\n" +
                        "\uF0FC\tProfilaxis de endocarditis.\n" +
                        "\uF0FC\tInfecciones genitourinarias por C. trachomatis.\n" +
                        "\uF0FC\tProfilaxis de infecciones estreptocócicas.\n" +
                        "\uF0FC\tTos ferina.\n",
                " \uF0FC\tHipersensibilidad a Eritromicina u otros macrólidos. En pacientes con trastornos de conducción cardíaca (QT largo). Estolato de Eritromicina en insuficiencia hepática. ",
                "Torsades de pointes, arritmias, desmayos, arritmias ventriculares, muerte súbita. ",
                "Hipersensibilidad, urticaria, edema, prurito, Rash.",
                "Cólico, malestar gástrico, diarrea, náuseas, vómitos, ictericia, colestásica, anorexia, hepatitis, pancreatitis aguda leve reversible.",
                " ",
                " ",
                "Pérdida de la audición.",
                "Candidiasis oral, anafilaxia, fiebre medicamentosa. ",
                "\uF0FC\tAlfentanilo: Puede prolongarse su efecto.\n" +
                        "\uF0FC\tCarbamazepina, xantinas, cafeína ciclosporina, barbitúricos, fenitoína, bromocriptina, valproato, cisaprida, astemizol: mayor riesgo de toxicidad por los mencionados fármacos.\n" +
                        "\uF0FC\tTerfenadina, astemizol: riesgo de efectos cardíacos adversos. No administrar simultáneamente.\n" +
                        "\uF0FC\tWarfarina, puede potenciar el efecto anticoagulante.\n",
                "\uF0FC\tPuede administrarse con comidas en caso de irritación gástrica.\n" +
                        "\uF0FC\tVerificar la presentación para que la administración sea la correcta.\n" +
                        "\uF0FC\tAplicar los 5 correctos: Paciente correcto, Medicamento correcto, Vía correcto, \n"));

        mockLawyer(sqLiteDatabase, new MedicsData("1", "antibioticos.jpg",
                "Roxitromicina ",
                "RULID ",
                "Roxitromicina Comp. 50mg, 150mg y 300mg. ",
                "Macrólido ",
                "Antibióticos.",
                " B",
                "Roxitromicina, al igual que otros macrólidos, inhibe la síntesis proteica dependiente de ARN en el proceso de elongación de la cadena en los gérmenes susceptibles. La penetración intracelular contribuye de manera importante a la actividad antimicrobiana de Roxitromicina, la cual se concentra en linfocitos y macrófagos en niveles mayores a los de plasma, siendo ventajosa en la erradicación de algunos patógenos intracelulares. Aumenta la actividad adhesiva y quimiotáctica de los neutrófilos polimorfonucleares, las funciones básicas que permiten a estas células alcanzar el lugar de la infección. También estimula la fagocitosis y la lisis bacteriana. ",
                "En adulto 12 h, en niños 19 a 21 h.",
                "Rápida en el TGI. Los alimentos no alteran su absorción.",
                "Amplia en los tejidos. Se detecta en humos acuoso, líquido ampollar, leucocitos (hasta en 190 veces la concentración sérica), tejidos periodontales, lágrimas, líquidos sinovial, piel, tracto respiratorio, amígdalas y próstata. Atraviesa pobremente la BHE. Atraviesa la placenta y se e3xcreta en leche materna. Su unión a proteínas plasmáticas es de 85 a 95%. Alcanza el estado de equilibrio en 2 a 4 días. ",
                "Escaso ",
                "10% en orina, 53% en heces, 13% por los pulmones en el aire expirado. ",
                "\uF0FC\tFaringitis, amigdalitis, rinofaringitis, otitis media aguda, sinusitis, neumonía, bronquitis, bronquiectasias, infecciones de la piel y tejidos blandos. Uretritis, vaginitis y cervicitis no gonocócica.",
                "\uF0FC\tHipersensibilidad a la Roxitromicina u otros macrólidos, tratamiento con derivados del cornezuelo de centeno; en insuficiencia hepática severa comprimidos de 300 mg. ",
                " ",
                " Rash, urticaria, edema de Quincke.",
                "Náuseas, vómitos, diarrea, cólico, anorexia, hepatitis, hepatitis colestásica, gastralgia. ",
                "Cefalea, mareo, vértigo.",
                "Desórdenes en el gusto y el olfato.",
                " ",
                "Candidiasis vulvovaginal, hipersensibilidad, anafilaxia, debilidad.",
                "\uF0FC\tSulfametoxazol: sinergismo frente a H. influenzae.\n" +
                        "\uF0FC\tXantinas: puede elevar los niveles séricos de las xantinas.\n" +
                        "\uF0FC\tTerfenadina: riesgo de efectos cardiacos adversos.\n" +
                        "\uF0FC\t Digoxina: puede elevarse los niveles séricos de Digoxina.\n" +
                        "\uF0FC\t Ergotamina o Dihidroergotamina: riesgo de toxicidad aguda, vasoespasmo periférico severo y disestesia. Contraindicado el uso simultaneo.\n" +
                        "\uF0FC\tTriazolam, Midazolam: mayor riesgo de toxicidad nerviosa.\n" +
                        "\uF0FC\tBromocriptina: mayor riesgo de discinesia.\n" +
                        "\uF0FC\tFármacos que inhiben la síntesis de la vitamina K: mayor riesgo de sangrado.\n",
                "\uF0FC\tNo se recomienda los Comprimidos en menores de 4 años.\n" +
                        "\uF0FC\tReconstituir el polvo del sobre en agua hervida fría en el vaso que acompaña la formula.\n" +
                        "\uF0FC\tAdministrar antes que los alimentos.\n"));

        mockLawyer(sqLiteDatabase, new MedicsData("2", "antibioticos.jpg",
                "Ciprofloxacino",
                "CIPROLIN, CIPROXINA, CIPROXACOL, CIRIAX, ESPITACIN, PROBIOX ",
                " Ciprofloxacino. Comp.250mg, Comp.500mg, Comp.750mg, Susp. Oral. 250mg/5ml x 100ml, Susp. Oral.500mg/5ml x 100ml, Sol. EV 100mg/50ml, Sol. EV 200mg/100ml, Sol. EV 400mg/200ml.",
                " Fluoroquinolonas.",
                "Antibacteriano ",
                "Categoría FDA: C ",
                "Es un agente bactericida, interactúa intracelularmente inhibiendo el ADN girasa, encima bacteriana esencial para la duplicación, transcripción y reparación del ADN bacteriano. Es un activo contra: Citrobacter spp; enterobacter spp; E. cloacae, E. coli, klebsiella spp. ",
                "4 h.",
                "Se puede retrasar por las comidas, pero no se afecta sustancialmente. ",
                " Ampliamente a los riñones, hígado, vesícula, pulmones, tejido ginecológico, prostático, células fagocíticas, orina, bilis, esputo, piel, músculo, grasa, cartílago, hueso y LCR (10% de la concentración sérica en ausencia de inflamación meníngea; 14 a 37% en inflamación). Unión a proteínas plasmáticas 20 a 40%.",
                "Hepático, solo un 20%.",
                "Renal 40 a 50% inalterado en 24 h; 20 a 35% vía biliar.",
                "Infecciones urinarias.\n" +
                        "\uF0FC\tInfecciones osteoarticulares, neumonía por bacterias Gram negativas, de la piel y de tejidos blandos.\n" +
                        "\uF0FC\tDiarrea bacteriana.\n" +
                        "\uF0FC\tUretritis gonocócica\n",
                "Hipersensibilidad a ciprofloxacina u otras quinolonas. No debe emplearse en menores de 18 años ni en gestantes, así como en mujeres de lactancia. No administrar en antecedentes de tendinopatía inducida por quinolonas.",
                "Vasculitis, flebitis, taquicardia, arritmia, paro cardiaco.",
                "Rash, prurito, eritema, síndrome de Stevens-Johnson, fotosensibilidad moderada a severa, necrólisis epidérmica toxica, dolor e irritación en el sitio de inyección.",
                "Candidiasis oral, hemorragia GI, náuseas, vómitos, diarrea, cólico, dispepsia, colitis seudomembranosa, ictericia colestásica.",
                " ",
                "Nefritis intersticial, hematuria, edema de miembros inferiores, fiebre, insuficiencia renal, vaginitis. ",
                "Epistaxis, alteración del gusto, tinnitus.",
                "Reacciones de hipersensibilidad, cristaluria, edema de cara y cuello. ",
                "\uF0FC\tAminofilina, teofilina, cafeína: Aumentan el riesgo de toxicidad por xantinas e incrementan el riesgo de efectos adversos del SNC.\n" +
                        "\uF0FC\tAntiácidos, sucralfato, zinc, sulfato ferroso y laxantes que contengan magnesio: Disminuyen la absorción de Ciprofloxacino.\n" +
                        "\uF0FC\tDidanósido: reduce la absorción de ciprofloxacino.\n" +
                        "\uF0FC\tWarfarina: aumenta el efecto anticoagulante y el riesgo de hemorragia.\n" +
                        "\uF0FC\tCiclosporina: se elevan las concentraciones séricas de ciclosporina.\n" +
                        "\uF0FC\tFenitoína: pueden alterarse los niveles séricos de fenitoína.\n" +
                        "\uF0FC\tGlibenclamida: puede potenciarse el efecto hipoglicemiante.\n",
                "\uF0FC\tSe puede tomar con las comidas, no emplear antiácidos o sucralfato 6 horas antes o 2 horas después.\n" +
                        "\uF0FC\t No ingerir preparados de hierro en las 4 horas anteriores al uso de este medicamento.\n" +
                        "\uF0FC\t Mantener una buena hidratación.\n" +
                        "\uF0FC\tLa infusión EV se debe efectuaren un periodo de 60 minutos, preferiblemente en una vena mayor. Verificar la presentación para que la vía de administración sea la correcta.\n"));

        mockLawyer(sqLiteDatabase, new MedicsData("2", "antibioticos.jpg",
                "Enoxacino",
                "Comprecin",
                "ENOXACINO: Tab. 200mg, Tab. 400mg.",
                "Fluoroquinolona ",
                "Antibacteriano ",
                " C",
                " Bactericida, interactúa intracelularmente inhibiendo la ADN girasa, enzima bacteriana esencial para la duplicación, transcripción y reparación del ADN bacteriano. Su espectro incluye: Citrobacter diversus, C. freundii, Enterobacter cloacae, campylobacter, Branhamella, Haemophilus, serratia, E. coli, klebsiella spp.",
                "3 a 6 h.",
                "La acidez gástrica disminuye la biodisponibilidad ",
                " Ampliamente en los riñones, hígado, vesícula, pulmones, tejido ginecológico, prostático, células fagocíticas, orina, bilis, esputo. Mientas que el cérvix, trompas uterinas y miometrio, se difunde a concentraciones 1 a 2 veces el nivel plasmático, en el riñón y la próstata es de 2 a 4 veces dicho nivel. Se unen en un 40% a proteínas plasmáticas.",
                "Hepático solo un 15 a 20%. Inhibe alguna de las enzimas del citocromo P-450 ",
                " renal, 40 a 50% inalterado en 48 h; biliar 18%.",
                " \uF0FC\tInfecciones urinarias.\n" +
                        "\uF0FC\tGonorrea o uretritis gonocócica.\n ",
                "Hipersensibilidad al Enoxacino u otras quinolonas. Menores de 18 años, embarazo, lactancia, antecedentes de tendinopatía inducida por quinolonas, déficit de G6PD. ",
                " ",
                " Rash, prurito, eritema, síndrome de Steven –Jonhson, fotosensibilidad moderada a severa, necrólisis epidérmica tóxica. ",
                "Náuseas, vómitos, diarrea, dolor abdominal, dispepsia, colitis seudomembranosa. ",
                " ",
                " Hematuria, edema de miembros inferiores.",
                " ",
                " reacciones de hipersensibilidad, fiebre, edema de cara y cuello.",
                " \uF0FC\tAminofilina, Teofilina, Cafeína: con xantinas en general está contraindicado, pues el riesgo de toxicidad e incremento de los efectos adversos en el SNC son mucho mayores.\n" +
                        "\uF0FC\tAntiácidos, sucralfato, zinc, sulfato ferroso y laxantes que contengan Magnesio: disminuyen la absorción de Enoxacino.\n" +
                        "\uF0FC\tWarfarina: aumenta el efecto anticoagulante y el riesgo de hemorragia.\n" +
                        "\uF0FC\tAINEs: riesgo de convulsiones con altas dosis de quinolonas.\n" +
                        "\uF0FC\tDigoxina: puede elevar las concentraciones séricas de Digoxina.\n" +
                        "\uF0FC\tBismuto: reduce la biodisponibilidad en un 25%.\n",
                " \uF0FC\tNo tomar antiácidos ni preparados de hierro 8 horas antes o 2 horas después del Enoxacino.\n" +
                        "\uF0FC\tTomar con el estómago vacío.\n"));

        mockLawyer(sqLiteDatabase, new MedicsData("2", "antibioticos.jpg",
                " Esparfloxacino",
                " Zagam",
                " Esparfloxacino. Comp. 200mg.",
                " Fluoroquinolona",
                " Antibacteriano",
                "C ",
                " Agente bactericida, interactúa intracelularmente inhibiendo la ADN girasa, enzima bacteriana esencial para la duplicación, transcripción y reparación del ADN bacteriano. El espectro incluye: Staphylococcus.",
                "de eliminación 20 h.",
                " Velocidad V.O. variable, aunque usualmente baja. Alcanza su estado de equilibrio al primer día, los medicamentos no modifican su absorción. ",
                " Las quinolonas se distribuyen ampliamente a la mayoría de los líquidos y tejidos corporales; en los riñones, vesícula, hígado, pulmones, tejido ginecológico y prostático, células fagocíticas, orina, esputo, y bilis. Las concentraciones en mucosa nasal sinusal y amígdalas son 5 veces la plasmática. La penetración en LCR es limitada. Atraviesa la placenta, se excreta en leche materna",
                " Hepático, independiente del sistema de citocromo. El principal metabolito excretado en orina es un conjugado glucorónido, el cual es inactivo",
                " 66% fecal; 7 al 12% inalterado en orina en 72 h. la excreción biliar es de 10 a 20%.",
                " \uF0FC\tNeumonía bacteriana e infecciones crónicas del tracto respiratorio.\n" +
                        "\uF0FC\tSinusitis aguda.\n ",
                "Hipersensibilidad a Esparfloxacino u otras fluoroquinolonas. Menores de 18 años, embarazo, lactancia. Antecedentes de tendinopatía inducida por quinolonas y déficit de G6PD. ",
                " ",
                " Fotosensibilidad, Rash, prurito, enrojecimiento, Síndrome de Steven- Johnson, angioedema.",
                "Dolor abdominal, diarreas, náuseas o vómitos. ",
                "Agitación, confusión, alucinaciones, temblores, cefalea, nerviosismo, insomnio. ",
                "Nefritis intersticial ",
                " ",
                " Hipersensibilidad. Se ha reportado con otras fluoroquinolonas ruptura tendinosa.",
                " \uF0FC\tAntiácidos, sucralfato, zinc, sulfato ferroso y laxantes que contengan magnesio: Disminuyen la absorción de Esparfloxacino.\n" +
                        "\uF0FC\tAstemizol, Eritromicina, quinidina, amiodarona, bretilio, antidepresivos tricíclicos y fenotiazinas: por el riesgo de trastorno de repolarización cardiaca.\n" +
                        "\uF0FC\tDigoxina: eleva las concentraciones séricas de digoxina.\n" +
                        "\uF0FC\tTeofilina: se ha reportado con quinolonas reacciones severas.\n",
                " \uF0FC\tSe recomienda tomar con un vaso lleno de agua y mantener una ingesta adecuada de líquidos.\n" +
                        "\uF0FC\tTomar preferiblemente en la mañana.\n" +
                        "\uF0FC\tEvitar el uso simultaneo de antiácidos o sucralfato, de ser necesarios ingerirlos 4 horas antes o 4 horas después.\n" +
                        "\uF0FC\tEvitar la exposición exagerada a la luz solar o ultravioleta.\n"));

        mockLawyer(sqLiteDatabase, new MedicsData("2", "antibioticos.jpg",
                "Lomefloxacino ",
                " Lomefloxacino",
                "LOMEFLOXACINO. Tab. 400mg. ",
                "Fluoroquinolona ",
                "Antibacteriano ",
                " C",
                "Es un agente bactericida, interactúa intracelularmente inhibiendo la ADN girasa, enzima bacteriana esencial para la duplicación, trascripción, y reparación del ADN bacteriano. El espectro incluye: Haemophilus influenzae, Moraxella catarrhalis, campilobacter, citrobacter diversus, C. freundii, enterobacter cloacae, E, aerogenes, E. coli, Klebsiella spp, Morganella morganii, proteus mirabilis. ",
                "7 a 8 h.",
                " Rápida, puede reducirse por presencia de alimentos.",
                " Amplia en los riñones, hígado, vesícula, pulmones, tejido ginecológico, prostático, células fagocíticas, orina, bilis, esputo, esperma. Unión a proteínas plasmáticas 10%.",
                "Hepático 5%. ",
                "Renal inalterado en 48 h 60 a 80% y un 10% vía biliar. ",
                " \uF0FC\tInfecciones urinarias complicadas.\n" +
                        "\uF0FC\tInfecciones urinarias no complicadas.\n" +
                        "\uF0FC\tExacerbaciones de bronquitis bacteriana.\n" +
                        "\uF0FC\tprofilaxis de cirugía transuretral.\n ",
                "Hipersensibilidad a las fluoroquinolonas, gestantes, mujeres en lactancia. No debe emplearse en menores de 18 años. No administrar en antecedentes de tendinopatía inducida por quinolonas. ",
                " Hipotensión, hipertensión, arritmias, isquemia miocárdica.",
                "Fotosensibilidad (2,3%), Rash, prurito, eritema, Síndrome de Steven-Johnson, necrólisis epidérmica tóxica. ",
                "Náuseas, vómitos, diarrea, dolor abdominal y dispepsia, colitis seudomembranosa, hemorragia GI. ",
                " cefalea, psicosis toxica, agitación, alucinaciones, confusiones, temblores, mareo, aturdimiento, nerviosismo, somnolencia, insomnio, neuropatía periférica, convulsiones.",
                " Nefritis intersticial, hematuria, hematuria, edema de miembros inferiores, candidiasis vaginal, leucorrea, orquitis, epididimitis.",
                " ",
                " reacciones de hipersensibilidad, angioedema, fiebre",
                "\uF0FC\tAntiácidos, sucralfato, zinc, sulfato ferroso y laxantes que contengan magnesio: disminuyen la absorción de Lomefloxacino.\n" +
                        "\uF0FC\tWarfarina: aumenta el efecto anticoagulante y el riesgo de hemorragia.\n" +
                        "\uF0FC\tCiclosporina: pueden elevarse las concentraciones séricas de ciclosporinas.\n" +
                        "\uF0FC\tAINEs:  riesgo de convulsiones de dosis altas de quinolonas.\n" +
                        "\uF0FC\tAgentes que interfieren en las síntesis de vitamina K: vigilar por el riesgo de sangrado.\n ",
                " \uF0FC\tNo tomar antiácidos o sucralfato en las 6 horas antes o 2 horas siguientes.\n" +
                        "\uF0FC\tPuede tomarse con o sin alimentos preferiblemente en la noche.\n"));

        mockLawyer(sqLiteDatabase, new MedicsData("2", "antibioticos.jpg",
                "Norfloxacino",
                " NOROXIN, QUINOLOX, UROPLOX.",
                "Norfloxacino: Tab. 400mg. ",
                "Fluoroquinolonas ",
                "Antibacteriano ",
                "Categoría FDA: C ",
                " Agente bactericida, interactúa, intracelularmente inhibiendo la ADN girasa, enzima bacteriana esencial para la duplicación, transcripción, y reparación del ADN bacteriano. ",
                "3 a 4 h.",
                "cerca del 30 a 40% de la dosis es absorbida, puede ser reducida levemente por presencia de comida. ",
                "amplia en los riñones, hígado, vesícula, próstata, células, fagocíticas, orina, bilis, esputo. Se une en un 10 a 15% a proteínas plasmáticas. Alcanza sus mayores concentraciones en parénquima renal, bilis y vagina. Atraviesa la placenta, se excreta en leche materna ",
                "20% se metaboliza. ",
                "renal en un 26 a 40% inalterado, en 24 a 48 horas y vía biliar, 28 a 30%. El pH urinario afecta la solubilidad del norfloxacino, es menos soluble a pH de 7,5 aumentando por encima debajo de estos valores. ",
                " \uF0FC\tInfecciones urinarias.\n" +
                        "\uF0FC\tGastroenteritis bacteriana.\n" +
                        "\uF0FC\tUretritis gonocócica o gonorrea.\n" +
                        "\uF0FC\tPortadores crónicos de S. tiphy.\n ",
                " Hipersensibilidad a norfloxacino u otras quinolonas. Menores de 18 años, gestantes, lactancia. En antecedentes de tendinopatía inducida por quinolonas.",
                " ",
                " Rash, prurito, eritema, síndrome de Stevens – Johnson, fotosensibilidad, necrólisis epidérmica tóxica.",
                "náuseas, vómitos, diarrea, dolor abdominal, dispepsia, colitis seudomembranosa, pirosis, pancreatitis ",
                "psicosis tóxica, agitación, alucinaciones, confusión, temblores, mareo, aturdimiento, cefalea, nerviosismo, depresión, somnolencia, insomnio, neuropatía periférica, convulsiones, síndrome de Guillain – Barré. ",
                " nefritis intersticial, hematuria, edema de miembros inferiores, insuficiencia renal. La cristaluria, puede presentarse con dosis mayores de 800 mg V.O.",
                " ",
                " reacciones de hipersensibilidad, fiebre, edema de cara y cuello.",
                " \uF0FC\tAminofilina, teofilina, cafeína: aumenta el riesgo de toxicidad por xantinas e incrementa el riesgo de efectos adversos del SNC, aunque resulta menor que con otras quinolonas.\n" +
                        "\uF0FC\tAntiácidos, Sucralfato, Zinc, sulfato ferroso y laxantes que contengan magnesio: disminuyen la absorción de norfloxacino.\n" +
                        "\uF0FC\tDidanosido: reduce la absorción de ciprofloxacino.\n" +
                        "\uF0FC\tWarfarina: aumenta el efecto anticoagulante y el riesgo de hemorragia.\n" +
                        "\uF0FC\tCiclosporina: se elevan las concentraciones séricas de ciclosporina.\n" +
                        "\uF0FC\tAlcalinizantes urinarios: mayor riesgo de cristaluria.\n" +
                        "\uF0FC\tAINEs: riesgo de convulsiones con dosis altas de quinolonas.\n" +
                        "\uF0FC\tNitrofurantoína: antagoniza el efecto antibiótico.\n",
                " \uF0FC\tNo tomar antiácidos ni preparados de hierro en las 2 horas previas o siguientes a la administración de este medicamento.\n" +
                        "\uF0FC\tTomar con el estómago vacío.\n" +
                        "\uF0FC\tMantener una ingesta de líquidos suficiente para mantener un volumen de orina de 1.200 a 1.500 ml/d.\n"));

        mockLawyer(sqLiteDatabase, new MedicsData("2", "antibioticos.jpg",
                " Ofloxacino",
                " Flosil",
                " Ofloxacino. Tab. 200mg.",
                "Fluoroquinolona ",
                " Antibacteriano",
                " C",
                "Es un agente bactericida, interactúa intracelularmente inhibiendo el ADN girasa, enzima bacteriana esencial para la duplicación, transcripción, y reparación del ADN bacteriano. Su espectro incluye: Citrobacter diversus y C. ",
                "de eliminación 4,7 a 7 h.",
                "Rápida en el TGI, disminuye levemente por la presencia de comida. ",
                "Amplia en los riñones, hígado, vesícula, pulmones, tejidos ginecológico y prostático, células fagocíticas, orina, bilis, esputo, piel, fascia, grasa y LCR. La concentración en LCR, y en piel, fascia y grasa son menores del 50% de la concentración sérica. Unión a proteínas plasmáticas 25%. Atraviesa la placenta, se excreta en leche materna. ",
                " 3% se metaboliza.",
                " 70 a 90% inalterado vía renal por secreción tubular y filtración glomerular en 36 h, vía biliar 4 a 8%.",
                " \uF0FC\tInfecciones urinarias.\n" +
                        "\uF0FC\tInfecciones dérmicas y de tejidos blandos.\n" +
                        "\uF0FC\tGonorrea no complicada.\n" +
                        "\uF0FC\tProstatitis.\n" +
                        "\uF0FC\tExacerbaciones de las bronquitis bacterianas o neumonías.\n" +
                        "\uF0FC\tInfecciones endocervicales o uretrales por Chlamydia con o sin gonococia subyacente.\n" +
                        "\uF0FC\tBrucelosis aguda\n ",
                " Hipersensibilidad a Ofloxacino u otras fluoroquinolonas. Gestantes, lactancia, menores de 18 años. Antecedentes tendinopatía inducida por quinolonas: déficit de G6PD.",
                " ",
                " Rash, prurito, eritema, síndrome de Stevens-johnson, fotosensibilidad, necrólisis epidérmica tóxica.",
                "náuseas, vómitos, diarrea, dolor abdominal, dispepsia, disgeusia, colitis seudomembranosa. ",
                "psicosis tóxica, agitación, alucinaciones (sobre todo en ancianos), confusión, temblores, mareo, aturdimiento, cefalea, nerviosismo, depresión, somnolencia, insomnio, neuropatía periférica, convulsiones. ",
                "nefritis intersticial, hematuria, edema de miembros inferiores, vaginitis, leucorrea, disuria, prurito genital, dismenorrea. ",
                " ",
                "reacciones de hipersensibilidad, fiebre, edema de cara y cuello ",
                "\uF0FC\tAminofilina, teofilina, cafeína: aumentan el riesgo de toxicidad por xantinas e incrementan el riesgo de efectos adversos del SNC, este efecto es menor que en otras quinolonas.\n" +
                        "\uF0FC\tAntiácidos, sucralfato, zinc, sulfato ferroso y laxantes que contengan magnesio: disminuyen la absorción de Ofloxacino.\n" +
                        "\uF0FC\tWarfarina: aumenta el efecto anticoagulante y el riesgo de hemorragia.\n" +
                        "\uF0FC\tCiclosporina: se elevan las concentraciones séricas de ciclosporina.\n" +
                        "\uF0FC\tAINEs: riesgo de convulsiones con dosis altas de quinolonas.\n" +
                        "\uF0FC\tGlibenclamida: puede potenciarse el efecto hipoglicemiante.\n" +
                        "\uF0FC\tAgentes que inhiben la acción de la vitamina K: aumentan el riesgo de sangrado.\n ",
                " \uF0FC\tNo tomar antiácidos ni sucralfato en las 2 horas previas o siguientes a la administración de este medicamento.\n" +
                        "\uF0FC\tIngerir con el estómago vacío.\n" +
                        "\uF0FC\tEvitar la ingesta de alcohol.\n"));

        mockLawyer(sqLiteDatabase, new MedicsData("2", "antibioticos.jpg",
                "Pefloxacino ",
                " Peflacine",
                "Pefloxacino. Comp. 400mg. ",
                " Fluoroquinolonas",
                " Antibacteriano",
                "C ",
                "Es un agente bactericida, interactúa intracelularmente inhibiendo la ADN girasa, enzima bacteriana esencial para la duplicación, transcripción, y reparación del ADN bacteriano.  ",
                "de eliminación 7 a 14 h.",
                "bien absorbido desde el TGI, en 20 minutos. Los alimentos retardan la absorción, pero no afectan la biodisponibilidad. ",
                " las fluoroquinolonas se distribuyen ampliamente a la mayoría de líquidos y tejidos corporales; en los riñones, vesícula, hígado, pulmones, tejidos ginecológico y prostático, células fagocíticas, orina, esputo y bilis al alcanzan concentraciones elevadas. Penetran en LCR, obteniendo concentraciones de alrededor del 50 a 85%. La unión plasmática a proteínas es de 20 a 30%. Alcanza las concentraciones más elevadas en secreción bronquial y buenas en tiroides, glándulas salivales, piel mucosa orofaríngea, amígdalas y músculos. Cruza la placenta y se excreta en leche materna.",
                "hepático, se metaboliza 85 a 90%. No se presenta efecto de primer paso con este fármaco. ",
                "renal 41, 7% del cual 5% es inalterado. Parcial a través de la bilis. ",
                " \uF0FC\tInfecciones severas causadas por gérmenes sensibles.\n" +
                        "\uF0FC\tCistitis aguda en mujeres, uretritis gonocócica en varones.\n ",
                "Hipersensibilidad a pefloxacino u otras fluoroquinolonas. Gestantes, lactancia, menores de 18 años. La V. O. en >70 años. Antecedentes de tendinopatía inducida por quinolonas y déficit de G6PD. ",
                " ",
                "Rash, prurito, urticaria, fotosensibilidad, erupción eritematosa, edema de Quincke.  ",
                " náuseas, vómitos, dolor abdominal, diarrea, anorexia, distensión abdominal.",
                " desorientación, confusión, mareo, intranquilidad, insomnio, cefalea, agitación, convulsiones, mioclonías.",
                " insuficiencia renal",
                " ",
                " ",
                "\uF0FC\tAminofilina, teofilina, cafeína: aumenta el riesgo de toxicidad por xantinas e incrementan el riesgo de efectos adversos del SNC.\n" +
                        "\uF0FC\tAntiácidos, sucralfato, zinc, sulfato ferroso y laxantes que contengan magnesio: disminuyen la absorción de pefloxacino.\n" +
                        "\uF0FC\tWarfarina: aumenta el efecto anticoagulante y el riesgo de hemorragia.\n" +
                        "\uF0FC\tAgentes que inhiben la síntesis de la vitamina K: aumenta el riesgo de sangrado.\n ",
                " \uF0FC\tTomar con las comidas.\n" +
                        "\uF0FC\tLa infusión debe realizarse lentamente en 1 hora.\n"));

        mockLawyer(sqLiteDatabase, new MedicsData("2", "antibioticos.jpg",
                " Rosoxacina",
                " Bradacil",
                " Rosoxacina. Tab. 150mg",
                "Derivado de la 4-quinolona. ",
                "Antibacteriano ",
                "C ",
                " Derivado de la 4-quinolona con propiedades similares al Acido Nalidíxico. Este grupo de antibacterianos ejerce su acción por inhibición de la ADN girasa. Su espectro de acción incluye. Neissería gonorrhoeae, E.",
                "6 horas.",
                " rápida desde el TGI, se obtiene una mejor absorción si se administra con el estómago vacío.",
                "los derivados de la 4-quinolona se distribuyen ampliamente en los líquidos y tejidos corporales, alcanzan concentraciones elevadas en tejido renal y orina. La Rosoxacina se une a proteínas plasmáticas en 70%. ",
                " hepático",
                "renal 75% como Rosoxacina libre y metabolitos; en heces 25%. ",
                "  \uF0FC\tInfecciones gonocócicas uretrales y uretrovaginales agudas no complicadas.\n" +
                        "\uF0FC\tInfecciones bacterianas intestinales.\n",
                "Hipersensibilidad a la Rosoxacina otras quinolonas y quinolinas. Deficiencia de G6PD. Inhibidores de la ADN girasa en niños y adolescentes. ",
                " ",
                " fotosensibilidad, Rash, urticaria y prurito.",
                "náuseas, vómitos, diarrea y dolor abdominal. ",
                "psicosis tóxica, convulsiones, astenia, vértigo, cefalea, mareo, somnolencia, alteraciones del equilibrio, disforias y alucinaciones. ",
                " ",
                " ",
                " ",
                "\uF0FC\tWarfarina: puede aumentar el efecto anticoagulante y el riesgo de hemorragia.\n" +
                        "\uF0FC\tNitrofurantoína: puede antagonizar el efecto antibiótico.\n" +
                        "\uF0FC\tCloranfenicol: puede disminuir la eficacia de Rosoxacina.\n ",
                "\uF0FC\tAdministrar con el estómago vacío."));

        mockLawyer(sqLiteDatabase, new MedicsData("3", "antibioticos.jpg",
                " Cotrimoxazol",
                " Cotrimoxazol, Bacterol, Broncoflam, Dientrin.",
                " Cotrimoxazol. Tab. 200mg/40mg, tab. 400mg/80mg, Tab. 800mg/160mg, Susp. Oral 200mg/4omg, Susp. Oral 400mg/80mg.",
                "Antibacteriano antiprotozoario. ",
                " Asociación antibacteriano.",
                "Categoría FDA: C ",
                " Sulfametoxazol y trimetoprima bloquean la producción de los ácidos dihidrofólico y tetraidrofólico participa en la síntesis de ácido nucleico y proteínas. Ambos agentes tienen efectos sinérgicos. El espectro incluye: Streptococcus del grupo A; Streptococcus Pneumoniae, Bacillus anthracis, Nocardia asteroides, Neisseria meningitidis, Neisseria gonorrhoeae.",
                "10, 1 h+- 4,6 h.",
                " rápida y buena 100%.",
                "de Sulfametoxazol es amplia incluyendo leche materna, líquidos ocular, sinovial, peritoneal, pleural; de trimetoprima es amplia en riñones, hígado, bazo, secreciones, bronquiales, prostáticas, seminales, saliva, bilis, médula ósea, humor acuoso, hueso, esponjoso, pared intestinal. Sulfametoxazol (60 a 70%) y trimetoprima (40 a 70%) se unen a las proteínas plasmáticas. La asociación se distribuye con buenos niveles en esputo, fluido vaginal y secreción de oído medio. Atravieza la placenta, se excreta en leche materna. ",
                " a nivel hepático a metabolitos inactivos.",
                "Sulfametoxazol, renal 80 a 100% de cual el 30% es inalterado. Trimetoprima, renal 40 a 60%. Pequeñas cantidades de ambos por vía fecal. ",
                " \uF0FC\tInfecciones del tracto urinario, infecciones susceptibles, bronquitis.\n" +
                        "\uF0FC\tNeumonía por Pneumocystis carinii.\n" +
                        "\uF0FC\tProfilaxis de neumonía por Pneumocystis carinii.\n" +
                        "\uF0FC\tOtitis media aguda.\n" +
                        "\uF0FC\tEnterocolitis por Shigella, diarrea del viajero.\n" +
                        "\uF0FC\tIsosporiasis.\n ",
                " Hipersensibilidad conocida al Cotrimoxazol u otros fármacos relacionados, como furosemida, tiazidas, inhibidores de la anhidrasa carbónica y sulfonilureas; embarazo a término; insuficiencia renal y hepática severas, menores de 2 meses, LES, enfermos con anemia megaloblástica por deficiencia de folato.",
                " ",
                " prurito, Rash, fotosensibilidad, síndrome de Stevens-Johnson, necrólisis epidérmica tóxica, púrpura de Henoch- Schöolein.",
                "diarrea, náuseas, vómitos, anorexia, colitis seudomembranosa, hepatitis y pancreatitis. ",
                "mareo, cefalea, meningitis aséptica, convulsiones, ataxia, neuropatía periférica, vértigo, psicosis. ",
                " cristaluria, hematuria, nefritis intersticial, necrosis tubular, insuficiencia renal, oliguria.",
                "tinnitus ",
                " hipersensibilidad, fiebre, exacerbación del LES.",
                "\uF0FC\tMetotrexato, fenilbutazona, sulfinpirazona; los efectos tóxicos de estos medicamentos se potencian.\n" +
                        "\uF0FC\tAmiodarona, andrógenos, AINEs, sales de oro, esteroides anabolizantes, estrógenos, fenitoína, fenotiazinas, fluconazol, halotano, isoniazida, ketoconazol, metildopa, nitrofuranos, paracetamol, pravastatina, rifampicina, simvastatina, Acido Valproico: mayor riesgo de hepatotoxividad.\n" +
                        "\uF0FC\tAgentes hemolíticos como Furazolidona, hipoglicemiante orales, Metildopa, nitrofuranos y sulfonamidas sistémicas: mayor riesgo de hemólisis.\n" +
                        "\uF0FC\tWarfarina: mayor riesgo de sangrado.\n" +
                        "\uF0FC\tAnticonvulsivos tipo hidantoína: aumento de la concentración sérica de los mencionados medicamentos.\n" +
                        "\uF0FC\tSulfonilureas: aumento de la concentración sérica de estos fármacos.\n" +
                        "\uF0FC\tDepresores de médula ósea como Amfotericina B, Metamizol, Azatioprina, Ciclofosfamida, Cisplatino, Citarabina, Cloranfenicol, Clozapina, Colchicina, Didanosina, Etopósido, Doxorubicina, Flucitosina, Ifosfamida, Fluorouracilo, interferones, Mercaptopurina, Metotrexato, Mitomicina, Vidarabina, Vincristina, Vinblastina, Zidovudina: mayor riesgo de mielo depresión.\n" +
                        "\uF0FC\tAnticonceptivos orales con Estrógeno: puede disminuir la eficacia de los anticonceptivos orales. \n" +
                        "\uF0FC\tCiclosporinas: eleva el riesgo de rechazo al trasplante.\n" +
                        "\uF0FC\tDapsona: aumenta la gravedad de efectos secundarios de la Dapsona.\n" +
                        "\uF0FC\tAgentes antagonistas del folato: puede provocar anemia megaloblástica.\n" +
                        "\uF0FC\tRifampicina: disminuye su vida media y aumenta la eliminación de trimetoprima.\n" +
                        "\uF0FC\tDiuréticos tiazídicos: particularmente en ancianos incrementa el riesgo de trombocitopenia y púrpura.\n ",
                " \uF0FC\tMantener una hidratación adecuada (1.200 a 1.500).\n" +
                        "\uF0FC\tTomar con los alimentos para disminuir la irritación GI.\n" +
                        "\uF0FC\tAdministrar por infusión EV lenta, revisar las indicaciones del fabricante para ajustar la velocidad de infusión.\n"));

        mockLawyer(sqLiteDatabase, new MedicsData("3", "antibioticos.jpg",
                " Sulfametizol",
                " Sulfametizol",
                " Sulfonamidas",
                " Sulfonamidas",
                "Antibacteriano ",
                "C ",
                " Antibiótico cuya estructura es similar al ácido p_aminobenzoico. Bloquea la síntesis de ácido nucleicos, al inferir con la formación del ácido fólico, por lo tanto, la sulfonamida no afecta a las células humanas. Es bacteriostático; no obstante, es bactericida cuando las concentraciones de timina son bajas en el medio. Las sulfonamidas han desarrollado una amplia resistencia, lo que reduce tu utilidad.",
                "1,5 a 3 h.",
                " rápida y buena en el TGI",
                " amplia en tejidos y fluidos incluyendo el pleural, peritoneal, sinovial y ocular, sólo alcanza bajas concentraciones en sangre y tejidos debido a su rápida excreción. Es muy soluble en orina. Unión a proteínas plasmáticas un 90%.",
                "hepática, por acetilación a metabolitos inactivos. ",
                "ranal 90%, inalterado en 10 horas, escasa en vía fecal, biliar y en otras secreciones corporales. ",
                " \uF0FC\tInfecciones urinarias bajas no complicadas. Las características descritas son del fármaco individual, pero pueden variar en asociación. ",
                "Hipersensibilidad al Sulfametizol u otras sulfonamidas, Furosemida, diuréticos tiazídicos, sulfonilureas o a los inhibidores de la anhidrasa carbónica. Menores de 2 meses. ",
                " ",
                "Rash cutáneo, prurito, fotosensibilidad, síndrome de Stevens-Johnson, síndrome de Lyell. ",
                " hepatitis, diarrea, anorexia, náuseas, vómitos.",
                "mareo, cefalea, letargo. ",
                " cristaluria, hematuria, nefritis intersticial, necrosis tubular.",
                " ",
                "hipersensibilidad, fiebre. ",
                " \uF0FC\tPenicilinas: puede contrarrestar los efectos bacteriostáticos de las penicilinas.\n" +
                        "\uF0FC\tMetenamida: mayor riesgo de cristaluria.\n" +
                        "\uF0FC\tAmiodarona, andrógenos, AINEs, sales de oro, esteroides anabolizantes, estrógenos, Fenitoína, fenotiazinas, fluconazol, Halotano. Isoniazida, Ketoconazol, Metotrexato, Metildopa, nitrofuranos, Paracetamol, Pravastatina, Rifampicina, Simvastatina, Acido Valproico: mayor riesgo de hepatotoxicidad.\n" +
                        "\uF0FC\tDepresores de médula ósea como Amfotericina B, Metamizol, Azatioprina, Ciclofosfamida, Cisplatino, Citarabina, Cloranfenicol, Clozapina, Fluorouracilo, interferones, Mercaptopurina, Metotrexato, Mitomicina, Vidarabina, Vincristina, Vinblastina, Zidovudina: pueden incrementar la miolotoxicidad.\n" +
                        "\uF0FC\tCiclosporina: puede disminuir las concentraciones de Ciclosporina.\n" +
                        "\uF0FC\tWarfarina: puede aumentar el efecto anticoagulante.\n" +
                        "\uF0FC\tMetotrexato y fenitoína: puede potenciar el efecto de dichos medicamentos.\n",
                "\uF0FC\tVerificar que el medicamento sea el correcto. "));

        mockLawyer(sqLiteDatabase, new MedicsData("3", "antibioticos.jpg",
                " Sulfametoxazol",
                "Sulfametoxazol ",
                " ",
                " Sulfonamida",
                "Antibacteriano ",
                " C",
                " Antibiótico cuya estructura es similar al ácido p-aminobenzoico. Bloque la síntesis de ácidos nucleicos, al interferir con la formación del ácido fólico. El ácido dihidrofólico se obtiene de la dieta del ácido fólico, por lo tanto, la sulfonamida no afecta a las células humanas. Es bacteriostático; no obstante, es bactericida cuando las concentraciones de timina son bajas en el medio. Las sulfonamidas han desarrollado una amplia resistencia, lo que reduce su utilidad.",
                "6 a 12 horas.",
                " rápida en el TGI",
                "Amplia en todos los tejidos, siendo detectado en orina, saliva, sudor, bilis, LCR, líquido peritoneal, ocular, sinovial, pleural y otras efusiones. Unión a proteínas plasmáticas 65%. ",
                "hepático, donde experimenta conjugación a un derivado inactivo. ",
                " renal cerca del 80 a 100%, de esta cifra el 20 a 40% como forma inalterada. La excreción del fármaco inalterado disminuye con la acidificación de la orina.",
                " \uF0FC\tInfecciones urinarias no complicadas. Las características descritas son del fármaco individual, pero pueden variar en asociación. ",
                " Hipersensibilidad al Sulfametoxazol u otras sulfonamidas, Furosemida, diuréticos tiazídicos, sulfonilureas o inhibidores de la anhidrasa carbónica; en insuficiencia renal o hepática severa, porfiria, gestantes próximas al trabajo de parto, lactancia y en menores de 2 meses",
                "miocarditis, vasculitis, poliarteritis nodosa, cianosis. ",
                "Rash, fotosensibilidad, dermatitis exfoliativa, necrólisis epidérmica tóxica, eritema nodoso, eritema multiforme severo fatal, síndrome de Stevens-johnson. ",
                " náuseas, vómito, diarrea, anorexia, necrosis hepática, ",
                "meningitis aséptica, ataxia, hipertensión endocraneana benigna, convulsiones, mareo, somnolencia, fática, cefalea, insomnio, depresión, neuropatía periférica, psicosis, vértigo. ",
                "nefritis intersticial, necrosis tubular, hematuria, anuria, oliguria. ",
                " ",
                "hipersensibilidad, fiebre, síndrome semejante a la enfermedad del suero, anafilaxia. ",
                "\uF0FC\tPenicilinas: puede contrarrestar los efectos bacteriostáticos de las penicilinas.\n" +
                        "\uF0FC\tMetenamida:  mayor riesgo de cristaluria.\n" +
                        "\uF0FC\tAmiodarona, andrógenos, AINEs, sales de oro, esteroides anabolizantes, estrógenos, Fenitoína, Fenotiazinas, fluconazol, Halotano, Isoniazida, Ketoconazol, Metotrexato, Metildopa, nitrofuranos, Paracetamol, Pravastatina, Rifampicina, Simvastatina, Acido Valproico: mayor riesgo de hepatotoxicidad.\n" +
                        "\uF0FC\tDepresores de médula ósea como Amfotericina B, Metamizol, Azatioprina, Ciclofosfamida, Cisplatino, Citarabina, Cloranfenicol, Clozapina, Colchicina, Vidarabina, Vincristina, Vimblastina, Zidovudina: pueden incrementar la miolotoxicidad.\n" +
                        "\uF0FC\tAgentes hemolíticos como Furazolidona, hipoglicemiantes orales, Metildopa, nitrofuranos: mayor riesgo de hemólisis.\n" +
                        "\uF0FC\tAnticonceptivos orales con estrógeno: puede aumentar el riesgo de ginecorragia intermenstrual y embarazo.\n" +
                        "\uF0FC\tCiclosporina: puede disminuir las concentraciones de Ciclosporina.\n" +
                        "\uF0FC\tWarfarina: puede aumentar el efecto anticoagulante.\n" +
                        "\uF0FC\tMetotrexato y Fenitoína: puede potenciar el efecto de dichos medicamentos.\n" +
                        "\uF0FC\tAcido p-aminobenzoico y derivados anestésicos locales del grupo de la procaína: pueden antagonizar los efectos del Sulfametoxazol.\n" +
                        "\uF0FC\tAINEs: pueden competir con Sulfametoxazol por sitios de unión plasmático.\n ",
                " \uF0FC\tVerificar que el medicamento sea el correcto."));

        mockLawyer(sqLiteDatabase, new MedicsData("3", "antibioticos.jpg",
                "Trimetropim ",
                "Trimetropim ",
                " ",
                " Antagonista del ácido fólico.",
                " Antibacteriano",
                " C",
                " Inhibidor de la dihidrofólico reductasa. Inhiben la síntesis del ácido tetrahidrofolico, necesario para la síntesis de aciertos aminoácidos, purina, timidina y ADN.",
                "10 h +- 2 h.",
                " rápida y completa en el TGI.",
                " amplia en el organismo, en riñones, hígado, pulmones, secreciones bronquiales, saliva, humor acuoso, próstata y secreciones prostática y vaginal. La concentración en LCR es 25 a 50% de la concentración sérica. Cruza la placenta. Se excreta en la leche materna. Puede encontrarse en hueso esponjoso y médula, pero no en hueso compacto. Unión a proteínas plasmáticas 37% +- 5%. ",
                " Hepático, 10 a 20%.",
                "renal, 40 a 60% del cual 80% es inalterado, se elimina en 24 horas. Es hemodializable. ",
                " \uF0FC\tInfecciones urinarias no complicadas. Las características descritas son del fármaco individual, pero pueden variar en asociación. ",
                " Hipersensibilidad a Trimetoprima. Antecedentes de anemia megaloblástica por deficiencia de folato. Contraindicado durante el trabajo de parto.",
                " ",
                " prurito, Rash maculopapular y morbiliforme, dermatitis exfoliativa, síndrome de Stevens-Johnson, necrólisis epidérmica tóxica, fototoxicidad",
                " sequedad bucal, náuseas, vómito, glositis.",
                " meningitis aséptica, cefalea.",
                " ",
                " ",
                " fiebre, hipersensibilidad",
                " \uF0FC\tFenitoína, Digoxina, Procainamida: pueden incrementar los niveles séricos de estos fármacos.\n" +
                        "\uF0FC\tWarfarina: puede potenciar el efecto anticoagulante.\n" +
                        "\uF0FC\tZidovudina: disminuye la excreción de Zidovudina.\n" +
                        "\uF0FC\tDepresores de médula ósea como Amfotericina B, Metamizol, Azatioprina, Ciclofosfamida, Cisplatino, Citarabina, Cloranfenicol, Clozapina, Colchicina, Didanosina, Etopósido, Doxorubicina, Flucitosina, Ifosfamida, Fluorouracilo, interferones, Mercaptopurina, Metotrexato, Mitomicina, Vidarabina, Vincristina, Vimblastina, Zidovudina: mayor riesgo de miolotoxicidad.\n" +
                        "\uF0FC\tCiclosporina: mayor riesgo de nefrotoxicidad.\n" +
                        "\uF0FC\tFenitoína, Fenobarbital, Metotrexato, Pirimetamina, Sulfonamidas, Triamtereno, Acido Valproico: mayor riesgo de anemia megaloblástica.\n",
                " \uF0FC\tEvaluar la relación riesgo-beneficio en las siguientes condiciones: insuficiencia renal o hepática, desordenes hematológicos severos."));

        mockLawyer(sqLiteDatabase, new MedicsData("4", "antibioticos.jpg",
                " Doxiciclina",
                " Supracyclin, vibramicina.",
                "Doxiciclina ",
                " Tetraciclinas",
                "Antibióticos ",
                " D",
                "Bacteriostático de gran espectro. Se une en forma reversible a la subunidad 30S de los microorganismos. Puede interferir con la síntesis de proteínas, no obstante, no inhibe la síntesis de la pared bacteriana. El espectro incluye. ",
                "12 a 22 h.",
                " 90 a 100% en el TGI. La leche disminuye su absorción.",
                " se distribuye en bilis, secreción sinusal, líquidos sinovial, ascítico, pleural, y crevicular gingival, hueso, hígado, dientes, tumores, bazo, LCR, ojo, próstata, placenta y leche materna. Las concentraciones en próstata son el 65% de las concentraciones séricas. Unión a proteínas plasmáticas 93%.",
                "hepático parcialmente. ",
                " vía biliar y renal 41% +- 19% de fármaco inalterado.",
                " \uF0FC\tUretritis por chlamydia trachomatis o Ureaplasma urealyticum, infecciones uretrales, endocervicales o rectales por Chlamydia no complicadas. \n" +
                        "\uF0FC\tInfecciones gonocócicas no complicadas.\n" +
                        "\uF0FC\tSífilis primaria o secundaria en pacientes alérgicos a penicilina.\n" +
                        "\uF0FC\tBrucelosis.\n" +
                        "\uF0FC\tDiarrea del viajero.\n" +
                        "\uF0FC\tOtras infecciones por microorganismos susceptibles.\n" +
                        "\uF0FC\tProfilaxis de malaria de viajeros a zonas endémicas por P. falciparum cloroquinorresitente y con Mefloquina contraindicada.\n ",
                " Hipersensibilidad a tetraciclinas o anestésicos locales tipos caína. El uso EV y el tratamiento prolongado. En gestantes, lactantes y niños menores de 8 años, salvo que no se disponga de alternativa.",
                "pericarditis ",
                " fotosensibilidad, Rash, urticaria, edema angioneurótico, pigmentación de uñas y dientes.",
                " manchas permanentes en los dientes en lactantes y niños, hepatotoxicidad, pancreatitis, cólico, náuseas, vómitos, diarrea, xerostomía, glositis, úlcera esofágica.",
                " hipertensión intracraneal benigna, toxicidad del SNC, desmejoramiento de la memoria, cefalea, parestesias.",
                " nefrotoxicidad, síndrome de fanconi.",
                "anosmia ",
                " crecimiento fúngico, superinfección, angioedema, fiebre medicamentosa, anafilaxia, síndrome similar al de Jarish-Herxheimer.",
                "\uF0FC\tColestipol o Colestiramina: reducen la absorción en TGI de Doxiciclina.\n" +
                        "\uF0FC\tAnticonceptivos orales que contienen estrógeno: pueden disminuir la eficacia del anticonceptivo y aumentar la incidencia de ginecorragia.\n" +
                        "\uF0FC\tAntiácidos, suplementos de calcio y de hierro, salicilato de magnesio, laxantes de magnesio, bicarbonato de sodio. Pueden disminuir la adsorción de las tetraciclinas.\n" +
                        "\uF0FC\tMetoxiflurano. Potencia la nefrotoxicidad.\n" +
                        "\uF0FC\tPenicilinas: inhibe su efecto bactericida.\n" +
                        "\uF0FC\tBarbitúricos, Carbamazepina, Fenitoína: pueden disminuir las concentraciones séricas de Doxiciclina.\n ",
                " \uF0FC\tNo es necesario tomar con el estómago vacío.\n" +
                        "\uF0FC\tAdministrar con alimentos o con leche en caso de irritación gastrointestinal.\n" +
                        "\uF0FC\t Los antiácidos suplementos de calcio, salicilatos de magnesio, suplementos de hierro, laxantes de magnesio, o bicarbonato de sodio, deben evitarse por lo menos 1 a 3 horas siguientes a la administración del fármaco.\n"));


        mockLawyer(sqLiteDatabase, new MedicsData("4", "antibioticos.jpg",
                " Minociclina",
                " Minocin",
                " Minociclina. Tab. 100mg.",
                "Tetraciclinas ",
                " Antibiótico",
                "D ",
                "Bacteriostático de gran espectro.  Se une en forma reversible a la subunidad 30S de los microorganismos. Puede interferir con la síntesis de proteínas, no obstante, no inhibe la síntesis de la pared bacteriana. El espectro incluye: Chlamydia, treponemas, mycoplasmas, clostridium, actinomices, yersinia pestis, francisella tularensis. ",
                "16h +- 2h.",
                " Amplia en el TGI del 90 al 100%, de los alimentos afectan poco.",
                " Se distribuye en esputo, saliva, lagrimas, bilis, secreción sinusal, líquidos sinovial, ascítico, pleural y gingival; hueso, hígado, dientes, tumores, bazo, placenta y leche materna. Alcanza sus concentraciones más elevadas en saliva, esputo y lágrimas. Unión a proteínas plasmáticas 76%.",
                " a nivel hepático.",
                "Vía biliar y renal 11% +- 2%, inalterado. ",
                "\uF0FC\tInfecciones endocervicales uretrales, o rectales no complicadas.\n" +
                        "\uF0FC\tInfecciones por mycobacterium marinum.\n" +
                        "\uF0FC\tGonorrea.\n" +
                        "\uF0FC\tPortador de Neisseria meningitidis.\n" +
                        "\uF0FC\tInfecciones sistémicas por microorganismos suceptibles.\n  ",
                " Hipersensibilidad a tetraciclinas o anestésicos locales. En gestantes, lactantes y niños < 8 años, salvo que no se disponga de alternativa.",
                " ",
                "Fotosensibilidad pigmentación de la piel y membranas. ",
                " Manchas permanentes en los dientes en lactantes y niños, hepatotoxicidad, pancreatitis, cólico, náuseas, vómitos, diarrea, xerostomía, hipertrofia de papila, glositis, disfagia.",
                " Hipertensión intracraneal benigna, toxicidad del SNC, cefalea, parestesias, mareo.",
                " Síndrome de Fanconi, insuficiencia renal aguda.",
                "Anosmia, toxicidad vestibular.",
                " Crecimiento fúngico, superinfección, angioedema, fiebre medicamentosa, anafilaxia, síndrome similar al de Jarish-Herxheimer.  ",
                "\uF0FC\tColestipol o colestiramina: reducen la absorción en el TGI de minociclina.\n" +
                        "\uF0FC\tAnticonceptivos orales que contienen estrógeno: puede disminuir la eficacia del anticonceptivo y aumentar la incidencia de ginecorragia.\n" +
                        "\uF0FC\tAntiácidos, suplementos de calcio y de hierro, salicilatos de magnesio, suplementos de hierro, laxantes de magnesio, bicarbonato de sodio: pueden disminuir la absorción de las tetraciclinas.\n" +
                        "\uF0FC\tMetoxifluorano: potencia de nefrotoxicidad.\n" +
                        "\uF0FC\tPenicilinas: Inhibe su efecto bactericida.\n" +
                        "\uF0FC\tWarfarina: aumento del efecto anticoagulante y el riesgo de sangrado.\n" +
                        "\uF0FC\tDigoxina: mayor riesgo de toxicidad.\n ",
                "No es necesario tomar con el estómago vacío.\n" +
                        "\uF0FC\tSe debe evitar por lo menos 1 a 3 horas siguientes a la administración del fármaco otros medicamentos, productos lácteos.\n "));

        mockLawyer(sqLiteDatabase, new MedicsData("4", "antibioticos.jpg",
                "Oxitetraciclina ",
                "Terramicina, Tetrasona, Oxiciclina, Tetraphar, Tetradent. ",
                "Oxitetraciclina. Cáp. 250mg, Cáp. 500mg, Sol. Iny. 250mg/2ml +Lidocaina 2%. ",
                " Tetraciclinas",
                "Antibiótico ",
                "Categoría FDA: D ",
                " Antibiótico bacteriostático de amplio espectro. Se une en forma reversible a la subunidad 30S de los microorganismos. Puede interferir con la síntesis de proteínas, no obstante, no inhibe la síntesis de la pared bacteriana. El espectro incluye: Chlamydia, treponemas, micoplasma, clostridium, actinomices, rickettsiae, borrelia, haemophylus, etc.",
                "6 a 10 h.",
                " 60% en el TGI, los alimentos disminuyen la absorción.",
                " Se distribuye en bilis, secreciones sinusuales, líquidos sinovial, ascítico, pleural y gingival; hueso, hígado, dientes, tumores, bazo, LCR, próstata, placenta y leche materna. Unión a proteínas plasmáticas 65%.",
                "No es metabolizado en el hígado.",
                " Vía biliar y renal 70% se elimina inalterado en orina.",
                " \uF0FC\tBrucelosis.\n" +
                        "\uF0FC\tSífilis (pacientes alérgicos a penicilina).\n" +
                        "\uF0FC\t Gonorrea no complicada.\n" +
                        "\uF0FC\tInfecciones por mircoorganismos suceptibles.\n ",
                " Hipersensibilidad a tetraciclinas, gestantes, lactantes y niños <8 años, salvo que no se disponga de alternativa. Fórmulas con lidocaína en pacientes hipersensibles a anestésicos locales tipo amida.",
                " ",
                " Fotosensibilidad, erupción maculopapulosa y eritematosa, urticaria, pigmentación de las uñas y dientes.",
                " Manchas permanentes en los dientes en lactantes y niños, hepatotoxicidad, pancreatitis, cólico, náuseas, vómitos, diarrea, xerostomía, hipertrofia de la papila.",
                "Hipertensión intracraneal benigna, toxicidad del SNC, cefalea, parestesias. ",
                "Nefrotoxicidad, síndrome de Fanconi con tetraciclinas vencidas, retención nitrogenada. ",
                " Anosmia",
                " crecimiento fúngico, superinfección, angioedema, fiebre medicamentosa, anafilaxia, síndrome similar al de Jarish-Herxheimer, inflamación en el sitio de inyección IM.",
                "\uF0FC\tColestipol o colestiramina: reducen la absorción en TGI de Oxitetraciclina.\n" +
                        "\uF0FC\t Anticonceptivos orales que contienen estrógeno: pueden disminuir la eficacia del anticonceptivo y aumentar la incidencia de ginecorragia.\n" +
                        "\uF0FC\t Antiácidos, suplementos de calcio y de hierro, salicilatos de magnesio, suplementos de hierro, laxantes de magnesio, bicarbonato de sodio: pueden disminuir la absorción de las tetraciclinas.\n" +
                        "\uF0FC\t Metoxiflurano: Mayor riesgo de nefrotoxicidad.\n" +
                        "\uF0FC\tPenicilinas: Inhibe su efecto bactericida.\n" +
                        "\uF0FC\t Vitamina A: riesgo de hipertensión endocraneana.\n" +
                        "\uF0FC\tAnticoagulantes orales: Aumento del efecto anticoagulante y el riesgo de sangrado.\n" +
                        "\uF0FC\tDigoxina: Mayor riesgo de retención nitrogenada.\n ",
                "\uF0FC\tSe debe evitar por lo menos 1 a 3 horas siguientes a la administración del fármaco otros medicamentos, productos lácteos.\n" +
                        "\uF0FC\tverificar la presentación para que la vía de administración se a la correcta\n" +
                        "\uF0FC\tVerificar que el medicamento sea el correcto.\n "));

        mockLawyer(sqLiteDatabase, new MedicsData("4", "antibioticos.jpg",
                "Tetraciclina ",
                "Tetraciclina, Orencyclina, Quemiciclina, Tetranase. ",
                "Tetraciclina. Comp. 125mg, 250mg, y 500mg. Jbe. 125mg/5ml. ",
                "Tetraciclinas ",
                "Antibiótico ",
                " D",
                " Antibiótico bacteriostático de amplio espectro. Se une en forma reversible a la subunidad 30S de los microorganismos. Puede interferir con la síntesis de proteínas, no obstante, no inhibe la síntesis de la pared bacteriana, el espectro incluye. Staphylococcus aureus, Staphylococcus coagulasa negativos, Streptococcus pneuimoniae, S, piogenes grupo A, S.  agalactiae grupo B, propionibacterium acnes, branhamella catarrhalis, N.",
                "6 a 11 horas. ",
                "77% en el TGI. ",
                "Se distribuye en bilis, secreciones sinusales, liquido sinovial, ascítico, pleural y gingival; hueso, hígado, dientes, tumores, bazo, LCR, próstata, placenta y leche materna. Se une en un 65% a las proteínas plasmáticas. Las concentraciones en LCR son 10 a 25% después de la administración parenteral. ",
                " No se metaboliza.",
                "Renal y vía biliar, 60% inalterado. ",
                " \uF0FC\tinfecciones uretrales endocervicales o rectales no complicadas por chlamydia.\n" +
                        "\uF0FC\tAcné.\n" +
                        "\uF0FC\tBrucelosis.\n" +
                        "\uF0FC\tSífilis.\n" +
                        "\uF0FC\tGonorrea.\n" +
                        "\uF0FC\tOtras infecciones por microorganismos suceptibles.\n",
                " Hipersensibilidad a tetraciclinas. En gestantes, lactantes y niños menores de 8 años, salvo situación critica y que no se disponga de alternativa.",
                " ",
                " Fotosensibilidad, Rash, urticaria, pigmentación de uñas y dientes.",
                " Manchas permanentes en los dientes en lactantes y niños, hepatotoxicidad, pancreatitis, cólico, náuseas, vómitos, diarrea, xerostomía, glositis, úlcera esofágica, hipertrofia de la papila.",
                " Hipertensión intracraneal benigna, toxicidad del SNC, desmejoramiento de la memoria, cefalea, parestesias, mareo.",
                " Toxicidad renal, síndrome de Fanconi con tetraciclinas vencidas.",
                " anosmia, tinnitus",
                " Crecimiento fúngico, superinfección, angioedema, fiebre medicamentosa, anafilaxia, síndrome similar al de Jarish-Herxheimer.",
                "\uF0FC\tColestipol o colestiramina: reducen la absorción en TGI de tetraciclinas.\n" +
                        "\uF0FC\tAnticonceptivos orales que contienen estrógeno: puede disminuir la eficacia del anticonceptivo y aumentar la incidencia de ginecorragia.\n" +
                        "\uF0FC\t Antiácidos, suplementos de calcio y de hierro, salicilatos de magnesio, suplementos de hierro, laxantes de magnesio, bicarbonato de sodio: pueden disminuir la absorción de las tetraciclinas.\n" +
                        "\uF0FC\tMetoxiflurano: potencian la nefrotoxicidad.\n" +
                        "\uF0FC\tPenicilinas: Inhibe su efecto bactericida.\n" +
                        "\uF0FC\tVitamina A: Riesgo de hipertensión endocraneana.\n" +
                        "\uF0FC\tWarfarina: Aumento del efecto anticoagulante y el riesgo de sangrado.\n" +
                        "\uF0FC\tDigoxina: Mayor riesgo de toxicidad por digoxina.\n ",
                " \uF0FC\tSe debe evitar por lo menos 1 a 3 horas siguientes a la administración del fármaco, otros medicamentos, productos lácteos, o leche.\n" +
                        "\uF0FC\t La comida y la leche disminuyen su absorción.\n"));

        mockLawyer(sqLiteDatabase, new MedicsData("5", "antibioticos.jpg",
                "Clindamicina ",
                " Dalacin, Clindacin.",
                " Clindamicina. Cáp. 150mg y 300mg, Amp. 300mg/2ml y 600mg/4ml.",
                " Lincosamina",
                " Antibiótico",
                "Categoría FDA: C  ",
                " Antibiótico: bacteriostático o bactericida a concentraciones elevadas. Interfiere en la síntesis de proteínas en bacterias sensibles al fijarse en la subunidad 50S de los ribosomas de las bacterias, impidiendo la formación de uniones peptídicas. El espectro incluye: Staphylococcus aureus, S. epidermidis, Streptococci, pneumococci, Fusobacterium spp, Bacteroides fragilis, bacteroides melaninogenicus, peptococcus spp, Mobiluncus.",
                " 2,9h +- 42 min.",
                "Rápida en el TGI, un 90% en ayunas, los alimentos no afectan su absorción. ",
                "amplia y rápida, se acumula en concentraciones elevadas en hueso, orina y bilis. No penetra convenientemente en LCR y no debe emplearse en meningitis. Unión a proteínas plasmáticas de 92 a 94%. Se excreta en la leche materna. ",
                " Hepático con metabolitos activos. ",
                " Renal 10%, heces 3,6%, ambos sin modificar.",
                "\uF0FC\tInfecciones por microorganismos susceptibles. ",
                " Hipersensibilidad a clindamicina u otras lincosaminas, antecedentes de colitis seudomembranosa.",
                " ",
                "Rash, Rash morbiliforme, prurito y eritema. ",
                " Colitis seudomembranosa, náuseas, vómitos, diarrea, dolor abdominal, sabor metálico, esofagitis, ictericia, flatulencia, melena.",
                " ",
                " ",
                " ",
                " hipersensibilidad, fiebre, proliferación fúngica del área genital, reacciones anafilácticas severas.",
                "\uF0FC\tCloranfenicol, eritromicina: antagoniza el efecto antibiótico.\n" +
                        "\uF0FC\tBloqueantes neuromusculares y anestésicos volátiles: potencia el bloqueo neuromuscular.\n" +
                        "\uF0FC\tCaolín: puede disminuir la absorción del antibiótico.\n" +
                        "\uF0FC\tNeostigmina: antagoniza su efecto antimiastenico.\n" +
                        "\uF0FC\t Tramadol, morfina, petidina y otros analgésicos opiáceos: riesgo de depresión respiratoria aditiva.\n ",
                " \uF0FC\tAdministra con las comidas.\n" +
                        "\uF0FC\tNo administrar en bolo.\n" +
                        "\uF0FC\tNo administrar más de 30mg por minuto.\n" +
                        "\uF0FC\tNo exceder los 1,2 g de infusión por hora y non aplicar más de 600mg IM.\n" +
                        "\uF0FC\tVerificar la presentación para que la vía de administración sea la correcta.\n" +
                        "\uF0FC\tRevisar las instrucciones del fabricante sobre compatibilidad con otros fármacos.\n"));

        mockLawyer(sqLiteDatabase, new MedicsData("5", "antibioticos.jpg",
                " Lincomicina",
                "Lincomicina, Lincocin, Lincoplus.  ",
                "Lincomicina. Cáp. 500mg, Amp. 300mg/1ml y 600mg/2ml. ",
                " Lincosamina",
                " antibiótico",
                " C",
                "Bacteriostático y bactericida en concentraciones elevadas, inhibe la síntesis proteica ribosomal al unirse a la subunidad 50S bacteriana. El espectro incluye: Staphylococcus aureus, Staphylococcus albus, Streptococcus Pneumoniae, streptococci B- hemolíticos, Streptococcus viridans, clostridium tetani, C. perfringens, corynebacterium diphtheriae, corynebacterium acnes, bacteroides. ",
                " 5,1 h +-1,5h.",
                "es absorbido en el TGI moderadamente, siendo esta disminuida por los alimentos. Mantiene concentraciones terapéuticas por 6 a 8 horas. ",
                "amplia en los tejidos corporales, alcanzando concentraciones terapéuticas en huesos, bilis y orina. No alcanza concentraciones importantes en LCR. Unión a proteínas en un 70 a 85%, cruza la placenta, se excreta en la leche materna. ",
                "Hepático ",
                "Después de la administración oral 13,8%, se elimina en orina en 24h. la bilis es una vía importante de excreción. ",
                "\uF0FC\tInfecciones severas causadas por gérmenes sensibles: del tracto respiratorio, piel y tejidos blandos, osteomielitis y septicemia. ",
                " Hipersensibilidad a Lincomicina o Clindamicina.",
                " hipotensión, flebitis.",
                " rash, prurito, urticaria.",
                " colitis seudomembranosa, diarrea, naúseas, vómitos, cólico, estomatitis, esofagitis, ictericia colestásica.",
                "cefalea. ",
                " albuminuria, azoemia, cilindruria, proteinuria, hematuria, oliguria.",
                " tinnitus, vértigo",
                "superinfección micótica, fiebre, hipersensibilidad, angioedema, puede ocurrir reacciones cardiopulmonares severas por la administración endovenosa rápida. ",
                " \uF0FC\tCloranfenicol, eritromicina: antagonizan el efecto antibiótico.\n" +
                        "\uF0FC\tBloqueantes neuromusculares y anestésicos volátiles: potencia el bloqueo neuromuscular.\n" +
                        "\uF0FC\tCaolín: puede disminuir la absorción del antibiótico.\n" +
                        "\uF0FC\tPiridostigmina, Neostigmina: antagoniza su efecto antimiastenico. \n" +
                        "\uF0FC\tDifenoxilato, loperamida: mayor riesgo de colitis seudomembranosa.\n" +
                        "\uF0FC\tTramadol, Morfina, petidina y otros analgésicos opiáceos: riesgo de depresión respiratoria aditiva.\n",
                "\uF0FC\tTomar con el estomago vacío 1 hora antes o 2 horas después de los alimentos.\n" +
                        "\uF0FC\tAdministrar IM profundo.\n" +
                        "\uF0FC\tLa vía EV debe ser infundida en un mínimo de 60 minutos y no más de 1g/h.\n" +
                        "\uF0FC\tNo aplicar en bolo, se han reportado casos de paro cardiaco, ver advertencias.\n" +
                        "\uF0FC\tVerificar la presentación para que la vía de administración sea la correcta.\n "));

        mockLawyer(sqLiteDatabase, new MedicsData("6", "antibioticos.jpg",
                " Vancomicina",
                " Vancocin",
                " vancomicina. Vial 500 mg.",
                " Glicopéptido",
                " Antibiótico",
                " C",
                " Fármaco bactericida, excepto enterococos, frente a los cuales es bacteriostático. El medicamento interfiere con la formación de la pared bacteriana, produciendo la destrucción del germen. Aun cuando actúa en la síntesis de la pared bacteriana, lo hace en lugares diferentes a los alcanzados por las penicilinas, no compitiendo con estas. No se ha reportado resistencia cruzada entre vancomicinas y otros antibióticos.",
                "5,6 h +-1,8 h. ",
                " no se absorbe en el TGI. Intraperitoneal mente hasta el 65%.",
                " unión a proteínas plasmáticas un 55%. Vancomicina presenta una amplia distribución en el organismo, alcanzando concentraciones terapéuticas en los líquidos pleural, peritoneal, pericárdico, ascítico, pero no en LCR ni en bilis. La penetración en SNC mejora ante meninges inflamadas, pudiendo alcanzar niveles terapéuticos apropiados.",
                " sin metabolismo significativo.",
                "renal 79%+-11% en 24 h por filtración glomerular. ",
                "Endocarditis bacteriana en paciente con lesión valvular: profilaxis. ",
                "Hipersensibilidad a vancomicina. ",
                " taquicardia, flebitis.",
                "Rash, prurito, síndrome de Stevens-johnson, necrólisis epidérmica toxica. ",
                "náuseas, vómitos, colitis seudomembranosa. ",
                "somnolencia",
                " insuficiencia renal, nefritis",
                " ototoxicidad, disgeusia, tinnitus.",
                " anafilaxia, escalofríos, fiebre medicamentosa debilidad. Superinfecciones bacterianas o micóticas.",
                " \uF0FC\tAminoglucosidos, Amfotericina B, salicilatos, furosemida, Bumetanida (parenteral), cisplatino, ciclosporina: mayor riesgo de nefrotoxicidad u ototoxicidad,\n" +
                        "\uF0FC\tAntihistamínicos, fenotiazinas: riesgo de ototoxicidad por vancomicina.\n",
                "\uF0FC\tAdministrar por lo menos en 60 minutos, rotar las venas en las dosis sucesivas.\n" +
                        "\uF0FC\tLa infusión rápida puede provocar enrojecimiento de la parte superior del cuerpo, dolor y espasmo en la espalda y el pecho, no suspender la dosis sino disminuir la velocidad de infusión.\n" +
                        "\uF0FC\tEl medicamento es muy irritante, por lo que solo debe ser administrado por vía EV en infusión, en caso de extravasar puede producir necrosis tisular.\n "));

        mockLawyer(sqLiteDatabase, new MedicsData("7", "antibioticos.jpg",
                "Cicloserina ",
                " Seromycin",
                " Cicloserina. Cap. 250mg.",
                " Análogo del aminoácido D-alanina.",
                "Antituberculoso ",
                "C ",
                " Antibacteriano de amplio espectro, aun cuando en el Perú se usa fundamentalmente como fármaco antituberculoso. El medicamento al ser un análogo de la D-alanina compite por enzimas fundamentales en la formación de peptidoglicano y pared celular. El efecto es bactericida o bacteriostático, según la concentración que se pueda obtener en los sitios de infección.",
                " 10 h.",
                " buena y rápida en el TGI.",
                " es ampliamente distribuido en tejidos y líquidos corporales, obteniéndose importantes concentraciones en líquidos pleural, ascítico y sinovial, así como 50 a 80% en LCR de meninges no inflamadas y 80 a 100% en inflamadas. No se une a proteínas plasmáticas. Cruza la placenta, se excreta en leche materna.",
                "35% metabolizado. ",
                " en orina 65%en forma inalterada en 2 a 72 h.",
                "Tuberculosis pulmonar y extrapulmonar. ",
                "\uF0FC\tHipersensibilidad a Cicloserina, trastornos neurológicos centrales, especialmente epilepsia; cuadros depresivos y ansiosos graves, psicóticos, alcohólicos activos o en remisión; insuficiencia renal severa. ",
                " ICC.",
                "rash ",
                " ",
                " mareo, somnolencia, ansiedad, intranquilidad, depresión, pesadillas, disartria, ideas de suicidio, convulsiones, cefalea, tremor, vértigo, neuropatía, periferia, coma, hiperreflexia, aumento de presión y proteínas en el LCR.",
                " ",
                " ",
                "hipersensibilidad ",
                "\uF0FC\tAlcohol: puede incrementar el riesgo de convulsiones.\n" +
                        "\uF0FC\tIsoniazida y Etionamida: mayor riesgo de toxicidad en el SNC.\n" +
                        "\uF0FC\tFenitoína: eleva los niveles séricos de fenitoínas.\n ",
                "\uF0FC\tEl medicamento debe ser tomado inmediatamente después de los alimentos en caso de que el paciente presentase síntomas de irritación GI. "));

        mockLawyer(sqLiteDatabase, new MedicsData("7", "antibioticos.jpg",
                "Clofazimina ",
                " Lamprene",
                " Clofazimina. Cap. 50mg.",
                " Inhibidor de síntesis de pared celular.",
                "Anti leproso. ",
                " C",
                " el mecanismo no ha podido esclarecerse, se ha propuesto que el fármaco se une al ADN e inhibe la multiplicación del vacilo, ejerciendo un lento efecto bactericida.",
                " 10 d (dosis única) y 70 d (dosis multiple).",
                "la absorción del medicamento es variable, pero aumenta con alimentos. ",
                " el fármaco es altamente lipofílico, siendo incorporado en los adipocitos y en las células del retículo endotelial.",
                "parcialmente hepático. ",
                " 50% en heces, renal 1%, ambos sin modificar.",
                " \uF0FC\tLepra lepromatosa resistente a Dapsona.\n" +
                        "\uF0FC\tLepra multibacilar complicada por eritema nodoso leproso.\n" +
                        "\uF0FC\tInfecciones micobacterianas atípicas.\n",
                "Hipersensibilidad grave a clofazimina. ",
                " ",
                "Cambios en la coloración de la piel, prurito, rash, ictiosis, fotosensibilidad. ",
                " dolor abdominal intenso, hepatitis, ictericia, diarrea, náuseas, vómitos, intolerancia GI, obstrucción intestinal.",
                "Depresión, mareo, somnolencia, cefalea. ",
                " ",
                " alteración del gusto.",
                " el medicamento puede producir cambios de coloración en la cara interna de los párpados, sudor, lagrima, orina, esputo; infarto esplénico, tromboembolismo, anemia, cistitis, edema, fiebre, linfadenopatía.",
                "\uF0FC\tRifampicina: disminuye la absorción de Rifampicina.\n" +
                        "\uF0FC\tDapsona: podría disminuir el efecto antiinflamatorio de Clofazimina.\n ",
                "\uF0FC\tTomarlo con los alimentos, con el fin de incrementar la absorción y prevenir o aliviar las molestias GI. "));

        mockLawyer(sqLiteDatabase, new MedicsData("7", "antibioticos.jpg",
                " Estreptomicina",
                " Estreptomicina",
                "Estreptomicina: Amp. 1g 3ml. ",
                "Aminoglucósido ",
                "Antibiótico ",
                " D",
                " es bactericida, se une a la subunidad 30S del ribosoma, inhibiendo la síntesis de proteínas bacterianas, produciendo la ruptura de las membranas citoplasmáticas bacterianas y la muerte celular.",
                " 2,6 h+-24 mim.",
                " escasa en el TGI, vía intramuscular se absorbe rápida y totalmente.",
                " amplia distribución en suero, abscesos, líquidos ascítico, pericárdico, pleural, sinovial, linfático y peritoneal, alcanza elevadas concentraciones en la orina. Concentraciones bajas se alcanzan en la bilis, humor acuoso, secreciones bronquiales y esputo. Cruza levemente las meninges cuando están inflamadas y se concentra mejor en el LCR  de los recién nacidos. Cruza la placenta, y se excreta en leche materna. Pobre unión a proteínas.",
                "no se metaboliza. ",
                "inalterado por vía renal 50 a 60% y pequeña cantidad por la bilis. Puede ser eliminado parcialmente por hemodiálisis y menos eficazmente por diálisis peritoneal. ",
                " \uF0FC\tTuberculosis (en asociación con otros agentes antituberculosos).\n" +
                        "\uF0FC\tEndocarditis por estreptococos.\n" +
                        "\uF0FC\tEndocarditis por enterococos.\n" +
                        "\uF0FC\tOtras infecciones sensibles incluyendo brucelosis, peste, granuloma inguinal, cancroide, meningitis, neumonía, bacteriana.\n",
                " Hipersensibilidad a Estreptomicina u otros aminoglucósidos.",
                " ",
                "Rash, prurito, urticaria. ",
                " ",
                " irritabilidad, convulsiones, parestesia, bloqueo neuromuscular con depresión respiratoria, cefalea y letargo.",
                "proteinuria, poliuria, oliguria, insuficiencia renal. ",
                " ototoxicidad vestibular, perdida de la audición, tinnitus, sensación de taponamiento en los oídos.",
                " reacciones de hipersensibilidad, superinfecciones bacterianas y micóticas.",
                " \uF0FC\tAminoglucósidos: no administrar 2 aminoglucósidos simultáneamente pues se incrementa el riesgo de ototoxicidad, nefrotoxicidad y bloqueo neuromuscular.\n" +
                        "\uF0FC\tMetoxifluorano: el uso simultaneo o secuencial aumenta el riesgo de nefrotoxicidad y de bloqueo neuromuscular.\n" +
                        "\uF0FC\tAINEs, Amfotericina B, Cefalosporinas, ciclosporina, cisplatino, ciprofloxacino, metotrexato, rifampicina, tetraciclinas, vancomicina, teicoplanina y otros nefrotóxicos: aumentan el riesgo de toxicidad renal.\n" +
                        "\uF0FC\tAINEs, carboplatino, cisplatino, cloroquina, eritromicina, furosemida, hidroxicloroquina, quinidina, y otros fármacos ototóxicos: aumentan el riesgo de toxicidad auditiva.\n",
                " \uF0FC\tAdministrar solo IM profunda.\n" +
                        "\uF0FC\tNo mezclar con B-lactámicos. \n"));

        mockLawyer(sqLiteDatabase, new MedicsData("7", "antibioticos.jpg",
                " ETAMBUTOL",
                " Etambutol",
                " Etambutol: Tab. 400mg.",
                "Antituberculoso semisintético. ",
                " Antituberculoso",
                " B",
                "Antituberculoso. Su mecanismo de acción es parcialmente conocido; es bacteriostático, interfiere en la incorporación del ácido micólico suprimiendo la multiplicación por bloqueo de la síntesis de ARN. Es solamente eficaz frente a las micobacterias en división activa. No debe administrarse solo, sino junto a otros agentes antituberculosos, para prevenir la aparición de cepas resistentes. ",
                "3,1 h +- 24 min. ",
                "Rápida y casi completa en TGI. Los alimentos no alteran la absorción. ",
                " amplia en la mayoría de los tejidos y líquidos corporales, incluyendo pulmones, riñones y eritrocitos. No atraviesa la BHE, pero en el caso de meningitis alcanza concentraciones de 10 a 50% de la sérica. Unión a proteínas plasmáticas < 5%. Atraviesa la placenta, se excreta en leche materna.",
                "Hepático ",
                "Renal 80% en 24 h, por filtración glomerular. Por esta misma vía, inalterado 50% y 15% como metabolitos inactivos. Inalterado 20% en heces. ",
                " Tuberculosis",
                " Hipersensibilidad al Etambutol. En neuritis óptica. Salvo que en la evaluación clínica determine lo contrario.",
                " ",
                " Prurito, Rash.",
                " Anorexia, vomito, cólico, náuseas, ictericia.",
                " Neuritis óptica retrobulbar, neuritis periférica, cefalea, confusión, desorientación, alucinaciones.",
                " ",
                " ",
                "reacciones anafilactoides, fiebre. ",
                " \uF0FC\tNeurotóxicos como aminoglucósidos, fenitoína, carbamazepina, Cicloserina, cisplatino, ciprofloxacina, cloranfenicol sistémico. Disulfiram, Isoniazida, lincomicina, litio, metronidazol, nitrofurantoina, tetraciclinas, zalcitabina: puede potenciar la toxicidad de los mencionados fármacos.",
                " \uF0FC\tTomar como dosis única con los alimentos para evitar la irritación gástrica."));

        mockLawyer(sqLiteDatabase, new MedicsData("7", "antibioticos.jpg",
                " Etionamida",
                " Etionamida",
                "Etionamida: Cap. 250mg. ",
                "Derivado del acido  ",
                " Antituberculoso, Antileproso.",
                " C",
                " el medicamento parece interferir en la síntesis peptídica, inhibiendo la incorporación de ácido micólico en la pared bacteriana. El efecto de Etionamida puede ser bacteriostático o bactericida según la concentración alcanzada en la biofase del germen y la sensibilidad de este.",
                " 3 h.",
                "Rápida en el TGI. ",
                " Presenta una amplia distribución, incluyendo hígado, riñones y bazo. Alcanza buenas concentraciones en varios tejidos, atraviesa la BHE y la barrera placentaria, se excreta en leche materna.",
                "principalmente hepático o metabolitos activos e inactivos. ",
                "renal 1% inalterado, el resto como metabolitos inactivos ",
                "Tuberculosis. ",
                "Hipersensibilidad a la Etionamida o ante insuficiencia hepática severa. ",
                "Hipotensión ortostática, bloqueo ganglionar. ",
                " Rash, alopecia, dermatitis pelagroide, fotosensibilidad.",
                " ictericia, hepatitis, anorexia, sabor metálico, náuseas, vómitos, cólico, diarrea, sialorrea.",
                " Neuritis periférica, depresión, cambios en el estado de ánimo, confusión, convulsiones.",
                " ",
                " Estomatitis.",
                " ginecomastia, impotencia, púrpura irregularidad menstrual.",
                "\uF0FC\tNeurotóxicos como aminoglucósidos, fenitoína, carbamazepina, Cicloserina, cisplatino, ciprofloxacina, cloranfenicol sistémico, Disulfiram, etambutol, isoniazida, lincomicina, litio, metronidazol, nitrofurantoina, tetraciclinas, zalcitabina: mayor riesgo de neuritis óptica y periférica. ",
                "\uF0FC\tLa dosis única por la noche puede incrementar la eficacia, pero también aumentar las molestias gastrointestinales.\n" +
                        "\uF0FC\tPuede tomarse con antiácidos y piridoxina.\n "));

        mockLawyer(sqLiteDatabase, new MedicsData("7", "antibioticos.jpg",
                " Isoniazida",
                " Isoniazida",
                " ISONIAZIDA. Tab. 100mg, Tab. 300mg.",
                " Hidrácida del ácido nicotínico.",
                "Antituberculoso. ",
                "Categoría FDA: C ",
                " Antituberculoso: su mecanismo de acción no se conoce exactamente. Parece inhibir la sin tesis del ácido micólico e interrumpir la formación de la pared celular. Tiene acción bactericida y bacteriostática dependiendo de su concentración y de la susceptibilidad de la micobacteria. El espectro incluye Mycobacterium tuberculosis, M.bovis y algunas cepas de M. Kansassi.",
                " 1,1 h +- 6 min acetiladores rápidos y 3,1 h +- 1,1 h en acetiladores lentos.",
                "rápida y completa en el TGI. Las concentraciones máximas declinan hasta 50% o menos en las siguientes 6 horas de la absorción. Su absorción y biodisponibilidad disminuyen cuando se administra junto a los alimentos.  ",
                " Amplia en LCR, líquidos pleural y ascítico, en los tejidos, saliva, esputo y heces. Atraviesa la placenta. Se excreta en leche. Atraviesa la placenta. Se excreta en leche materna donde alcanza concentraciones similares a las plasmáticas.",
                "hepático; la velocidad de acetilación está determinada genéticamente: caucásicos y negros, lentos; orientales, rápidos. En el Perú se a presentado una mayor prevalencia de acetiladores lentos. La velocidad de acetilación no altera la eficacia del fármaco. La acetilación lenta puede producir niveles séricos más elevados y Mayor riesgo de toxicidad. ",
                " Vía renal 75 a 95% en 24 h, principalmente como metabolitos inactivos. Pequeñas cantidades se eliminan en las heces. En hepatopatía aguda o crónica, la vida media puede prolongarse hasta 6, 7 h.",
                " Tuberculosis, profilaxis de la tuberculosis",
                " Hipersensibilidad a la isoniazida u otros fármacos relacionados. En lesión hepática asociada al uso previo de isoniazida o antecedentes de reacción es adversas severas, incluyendo fiebre, escalofríos y artritis. Hepatopatía aguda de cualquier etiología. ",
                " ",
                "Rash. ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " "));

        mockLawyer(sqLiteDatabase, new MedicsData("4", "antibioticos.jpg",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " "));

        mockLawyer(sqLiteDatabase, new MedicsData("4", "antibioticos.jpg",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " "));

        mockLawyer(sqLiteDatabase, new MedicsData("4", "antibioticos.jpg",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " "));

        mockLawyer(sqLiteDatabase, new MedicsData("4", "antibioticos.jpg",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " "));

        mockLawyer(sqLiteDatabase, new MedicsData("4", "antibioticos.jpg",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " "));

        mockLawyer(sqLiteDatabase, new MedicsData("4", "antibioticos.jpg",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " "));

        mockLawyer(sqLiteDatabase, new MedicsData("4", "antibioticos.jpg",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " "));

        mockLawyer(sqLiteDatabase, new MedicsData("4", "antibioticos.jpg",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " "));

        mockLawyer(sqLiteDatabase, new MedicsData("4", "antibioticos.jpg",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " "));

        mockLawyer(sqLiteDatabase, new MedicsData("4", "antibioticos.jpg",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " "));

        mockLawyer(sqLiteDatabase, new MedicsData("4", "antibioticos.jpg",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " "));

        mockLawyer(sqLiteDatabase, new MedicsData("4", "antibioticos.jpg",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " "));

        mockLawyer(sqLiteDatabase, new MedicsData("4", "antibioticos.jpg",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " "));

        mockLawyer(sqLiteDatabase, new MedicsData("4", "antibioticos.jpg",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " "));

        mockLawyer(sqLiteDatabase, new MedicsData("4", "antibioticos.jpg",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " "));

        mockLawyer(sqLiteDatabase, new MedicsData("4", "antibioticos.jpg",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " "));




    }



    public long mockLawyer(SQLiteDatabase db, MedicsData medicsData){
        return db.insert(MedicsContract.MedicsEntry.TABLE_NAME,
                null, medicsData.toContentValues());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }

    public long saveLawyer(MedicsData medicsData){
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();

        return sqLiteDatabase.insert(
                MedicsContract.MedicsEntry.TABLE_NAME,
                null,
                medicsData.toContentValues());
    }
    public Cursor getAllLawyers(String tipoId) {
        return getReadableDatabase()
                .query(
                        MedicsContract.MedicsEntry.TABLE_NAME,
                        null,
                        MedicsContract.MedicsEntry.GROUP_MEDICS + " LIKE ?",
                        new String[]{tipoId},
                        null,
                        null,
                        null,
                        null);

    }

    public Cursor getLawyerById(String lawyerId) {
        Cursor c = getReadableDatabase().query(
                MedicsContract.MedicsEntry.TABLE_NAME,
                null,
                MedicsContract.MedicsEntry.ID + " LIKE ?",
                new String[]{lawyerId},
                null,
                null,
                null,
                null);
        return c;
    }
}
