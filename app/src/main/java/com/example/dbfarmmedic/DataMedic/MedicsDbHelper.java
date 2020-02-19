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

        mockLawyer(sqLiteDatabase, new MedicsData("1", "antibioticos.jpg",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                "",
                " ",
                " ",
                " ",
                " ",
                "  ",
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

        mockLawyer(sqLiteDatabase, new MedicsData("1", "antibioticos.jpg",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                "",
                " ",
                " ",
                " ",
                " ",
                "  ",
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

        mockLawyer(sqLiteDatabase, new MedicsData("1", "antibioticos.jpg",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                "",
                " ",
                " ",
                " ",
                " ",
                "  ",
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

        mockLawyer(sqLiteDatabase, new MedicsData("1", "antibioticos.jpg",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                "",
                " ",
                " ",
                " ",
                " ",
                "  ",
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

        mockLawyer(sqLiteDatabase, new MedicsData("1", "antibioticos.jpg",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                "",
                " ",
                " ",
                " ",
                " ",
                "  ",
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

        mockLawyer(sqLiteDatabase, new MedicsData("1", "antibioticos.jpg",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                "",
                " ",
                " ",
                " ",
                " ",
                "  ",
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

        mockLawyer(sqLiteDatabase, new MedicsData("1", "antibioticos.jpg",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                "",
                " ",
                " ",
                " ",
                " ",
                "  ",
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

        mockLawyer(sqLiteDatabase, new MedicsData("1", "antibioticos.jpg",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                "",
                " ",
                " ",
                " ",
                " ",
                "  ",
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

        mockLawyer(sqLiteDatabase, new MedicsData("1", "antibioticos.jpg",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                "",
                " ",
                " ",
                " ",
                " ",
                "  ",
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

        mockLawyer(sqLiteDatabase, new MedicsData("1", "antibioticos.jpg",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                "",
                " ",
                " ",
                " ",
                " ",
                "  ",
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

        mockLawyer(sqLiteDatabase, new MedicsData("1", "antibioticos.jpg",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                "",
                " ",
                " ",
                " ",
                " ",
                "  ",
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

        mockLawyer(sqLiteDatabase, new MedicsData("1", "antibioticos.jpg",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                "",
                " ",
                " ",
                " ",
                " ",
                "  ",
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


        mockLawyer(sqLiteDatabase, new MedicsData("1", "antibioticos.jpg",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                "",
                " ",
                " ",
                " ",
                " ",
                "  ",
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

        mockLawyer(sqLiteDatabase, new MedicsData("1", "antibioticos.jpg",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                "",
                " ",
                " ",
                " ",
                " ",
                "  ",
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

        mockLawyer(sqLiteDatabase, new MedicsData("1", "antibioticos.jpg",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                "",
                " ",
                " ",
                " ",
                " ",
                "  ",
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
