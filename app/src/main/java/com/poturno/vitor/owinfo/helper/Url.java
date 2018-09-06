package com.poturno.vitor.owinfo.helper;

public class Url {

    public static final String HEROES_LIST = "https://overwatch-api.net/api/v1/hero";
    public static final String MAPS_LIST = "https://overwatch-api.net/api/v1/map";
    public static final String GAME_MODE = "https://overwatch-api.net/api/v1/game-mode";
    public static final String BRAWL = "https://overwatch-api.net/api/v1/brawl-type";
    public static final String PLATFORM = "https://overwatch-api.net/api/v1/platform";





    public static String mapDetail(String id) {
        return MAPS_LIST + "/" + id;
    }

    public static String heroDetail(String id) {
        return HEROES_LIST + "/" + id;
    }

    public static String getSmallHeroImg(String id){
        switch (id){
            case "1":
                return "https://d1u1mce87gyfbn.cloudfront.net/hero/ana/icon-portrait.png";
            case "2":
                return "https://d1u1mce87gyfbn.cloudfront.net/hero/bastion/icon-portrait.png";
            case "3":
                return "https://d1u1mce87gyfbn.cloudfront.net/hero/dva/icon-portrait.png";
            case "4":
                return "https://d1u1mce87gyfbn.cloudfront.net/hero/genji/icon-portrait.png";
            case "5":
                return "https://d1u1mce87gyfbn.cloudfront.net/hero/hanzo/icon-portrait.png";
            case "6":
                return "https://d1u1mce87gyfbn.cloudfront.net/hero/junkrat/icon-portrait.png";
            case "7":
                return "https://d1u1mce87gyfbn.cloudfront.net/hero/lucio/icon-portrait.png";
            case "8":
                return "https://d1u1mce87gyfbn.cloudfront.net/hero/mccree/icon-portrait.png";
            case "9":
                return "https://d1u1mce87gyfbn.cloudfront.net/hero/mei/icon-portrait.png";
            case "10":
                return "https://d1u1mce87gyfbn.cloudfront.net/hero/mercy/icon-portrait.png";
            case "11":
                return "https://d1u1mce87gyfbn.cloudfront.net/hero/pharah/icon-portrait.png";
            case "12":
                return "https://d1u1mce87gyfbn.cloudfront.net/hero/reaper/icon-portrait.png";
            case "13":
                return "https://d1u1mce87gyfbn.cloudfront.net/hero/reinhardt/icon-portrait.png";
            case "14":
                return "https://d1u1mce87gyfbn.cloudfront.net/hero/roadhog/icon-portrait.png";
            case "15":
                return "https://d1u1mce87gyfbn.cloudfront.net/hero/soldier-76/icon-portrait.png";
            case "16":
                return "https://d1u1mce87gyfbn.cloudfront.net/hero/symmetra/icon-portrait.png";
            case "17":
                return "https://d1u1mce87gyfbn.cloudfront.net/hero/torbjorn/icon-portrait.png";
            case "18":
                return "https://d1u1mce87gyfbn.cloudfront.net/hero/tracer/icon-portrait.png";
            case "19":
                return "https://d1u1mce87gyfbn.cloudfront.net/hero/widowmaker/icon-portrait.png";
            case "20":
                return "https://d1u1mce87gyfbn.cloudfront.net/hero/winston/icon-portrait.png";
            case "21":
                return "https://d1u1mce87gyfbn.cloudfront.net/hero/zarya/icon-portrait.png";
            case "22":
                return "https://d1u1mce87gyfbn.cloudfront.net/hero/zenyatta/icon-portrait.png";
            case "23":
                return "https://d1u1mce87gyfbn.cloudfront.net/hero/sombra/icon-portrait.png";
            case "24":
                return "https://d1u1mce87gyfbn.cloudfront.net/hero/orisa/icon-portrait.png";
            default:
                return "";
        }
    }

    public static String getMapSmallImg(String id){
        switch (id){
            case "1":
                return "https://c-8oqtgrjgwu46x24f3w7r5n6yrca5mx2eenqwfhtqpvx2epgv.g00.gamepedia.com/g00/3_c-8qx78gtycvej.icogrgfkc.eqo_/c-8OQTGRJGWU46x24jvvrux3ax2fx2ff3w7r5n6yrca5m.enqwfhtqpv.pgvx2fqx78gtycvej_icogrgfkcx2fvjwodx2fgx2fgex2fFqtcfq-uvtggvu4.lrix2f747rz-Fqtcfq-uvtggvu4.lrix3fx78gtukqpx3d24990068fe282h79e4322f80610ce732x26k32e.octmx3dkocig_$/$/$/$/$/$/$";
            case "2":
                return "https://i.kinja-img.com/gawker-media/image/upload/s--ikYaNFBX--/c_scale,f_auto,fl_progressive,q_80,w_800/ijf66jxu1fmlazmwcash.jpg";
            case "3":
                return "https://c-8oqtgrjgwu46x24f3w7r5n6yrca5mx2eenqwfhtqpvx2epgv.g00.gamepedia.com/g00/3_c-8qx78gtycvej.icogrgfkc.eqo_/c-8OQTGRJGWU46x24jvvrux3ax2fx2ff3w7r5n6yrca5m.enqwfhtqpv.pgvx2fqx78gtycvej_icogrgfkcx2fvjwodx2f0x2f0dx2fGuvcfkqFcuTcu.lrix2f747rz-GuvcfkqFcuTcu.lrix3fx78gtukqpx3dd25ggg6261g7097hf9414437d0h67gf6x26k32e.octmx3dkocig_$/$/$/$/$/$/$";
            case "4":
                return "https://c-8oqtgrjgwu46x24f3w7r5n6yrca5mx2eenqwfhtqpvx2epgv.g00.gamepedia.com/g00/3_c-8qx78gtycvej.icogrgfkc.eqo_/c-8OQTGRJGWU46x24jvvrux3ax2fx2ff3w7r5n6yrca5m.enqwfhtqpv.pgvx2fqx78gtycvej_icogrgfkcx2fvjwodx2f6x2f68x2fJcpcowtc_eqpegrv.lrix2f747rz-Jcpcowtc_eqpegrv.lrix3fx78gtukqpx3d534750dhed2812550cg59gc0846f5445x26k32e.octmx3dkocig_$/$/$/$/$/$/$";
            case "5":
                return "https://c-8oqtgrjgwu46x24f3w7r5n6yrca5mx2eenqwfhtqpvx2epgv.g00.gamepedia.com/g00/3_c-8qx78gtycvej.icogrgfkc.eqo_/c-8OQTGRJGWU46x24jvvrux3ax2fx2ff3w7r5n6yrca5m.enqwfhtqpv.pgvx2fqx78gtycvej_icogrgfkcx2fvjwodx2f4x2f48x2fJqnnayqqf-ugv.lrix2f747rz-Jqnnayqqf-ugv.lrix3fx78gtukqpx3d3c935861498c54c63cfede8341e81f02x26k32e.octmx3dkocig_$/$/$/$/$/$/$";
            case "6":
                return "https://c-8oqtgrjgwu46x24f3w7r5n6yrca5mx2eenqwfhtqpvx2epgv.g00.gamepedia.com/g00/3_c-8qx78gtycvej.icogrgfkc.eqo_/c-8OQTGRJGWU46x24jvvrux3ax2fx2ff3w7r5n6yrca5m.enqwfhtqpv.pgvx2fqx78gtycvej_icogrgfkcx2fvjwodx2f6x2f67x2fKnkqu.lrix2f747rz-Knkqu.lrix3fx78gtukqpx3d408173797df4314788f19c6d28h8d031x26k32e.octmx3dkocig_$/$/$/$/$/$/$";
            case "7":
                return "https://c-8oqtgrjgwu46x24f3w7r5n6yrca5mx2eenqwfhtqpvx2epgv.g00.gamepedia.com/g00/3_c-8qx78gtycvej.icogrgfkc.eqo_/c-8OQTGRJGWU46x24jvvrux3ax2fx2ff3w7r5n6yrca5m.enqwfhtqpv.pgvx2fqx78gtycvej_icogrgfkcx2fvjwodx2f3x2f3dx2fMkpix2549u_Tqy_eqpegrv.lrix2f747rz-Mkpix2549u_Tqy_eqpegrv.lrix3fx78gtukqpx3d3dg90249f119c8081dg338dc9e28gd6dx26k32e.octmx3dkocig_$/$/$/$/$/$/$";
            case "8":
                return "https://c-8oqtgrjgwu46x24f3w7r5n6yrca5mx2eenqwfhtqpvx2epgv.g00.gamepedia.com/g00/3_c-8qx78gtycvej.icogrgfkc.eqo_/c-8OQTGRJGWU46x24jvvrux3ax2fx2ff3w7r5n6yrca5m.enqwfhtqpv.pgvx2fqx78gtycvej_icogrgfkcx2fvjwodx2f1x2f1dx2fNklkcpi_Vqygt_nqcfkpi_uetggp.lrix2f747rz-Nklkcpi_Vqygt_nqcfkpi_uetggp.lrix3fx78gtukqpx3d3c5fe5443g421cg14df69h05037d0975x26k32e.octmx3dkocig_$/$/$/$/$/$/$";
            case "9":
                return "https://c-8oqtgrjgwu46x24f3w7r5n6yrca5mx2eenqwfhtqpvx2epgv.g00.gamepedia.com/g00/3_c-8qx78gtycvej.icogrgfkc.eqo_/c-8OQTGRJGWU46x24jvvrux3ax2fx2ff3w7r5n6yrca5m.enqwfhtqpv.pgvx2fqx78gtycvej_icogrgfkcx2fvjwodx2fcx2fc8x2fTqwvg_88.lrix2f747rz-Tqwvg_88.lrix3fx78gtukqpx3dd828385h4e3gc21egegh93d96335e384x26k32e.octmx3dkocig_$/$/$/$/$/$/$";
            case "10":
                return "https://c-8oqtgrjgwu46x24f3w7r5n6yrca5mx2eenqwfhtqpvx2epgv.g00.gamepedia.com/g00/3_c-8qx78gtycvej.icogrgfkc.eqo_/c-8OQTGRJGWU46x24jvvrux3ax2fx2ff3w7r5n6yrca5m.enqwfhtqpv.pgvx2fqx78gtycvej_icogrgfkcx2fvjwodx2f3x2f3dx2fPwodcpk_Nqcfkpi_Uetggp.lrix2f747rz-Pwodcpk_Nqcfkpi_Uetggp.lrix3fx78gtukqpx3d427512cgh857ed1c53hhf42744eg4e52x26k32e.octmx3dkocig_$/$/$/$/$/$/$";
            case "11":
                return "https://c-8oqtgrjgwu46x24f3w7r5n6yrca5mx2eenqwfhtqpvx2epgv.g00.gamepedia.com/g00/3_c-8qx78gtycvej.icogrgfkc.eqo_/c-8OQTGRJGWU46x24jvvrux3ax2fx2ff3w7r5n6yrca5m.enqwfhtqpv.pgvx2fqx78gtycvej_icogrgfkcx2fvjwodx2fhx2fh5x2fPgrcn_nqcfkpi_uetggp.lrix2f747rz-Pgrcn_nqcfkpi_uetggp.lrix3fx78gtukqpx3d74g84df8919h8dedf9cg0cedfg86e377x26k32e.octmx3dkocig_$/$/$/$/$/$/$";
            case "12":
                return "https://c-8oqtgrjgwu46x24f3w7r5n6yrca5mx2eenqwfhtqpvx2epgv.g00.gamepedia.com/g00/3_c-8qx78gtycvej.icogrgfkc.eqo_/c-8OQTGRJGWU46x24jvvrux3ax2fx2ff3w7r5n6yrca5m.enqwfhtqpv.pgvx2fqx78gtycvej_icogrgfkcx2fvjwodx2ffx2ffgx2fCpwdku_eqpegrv.lrix2f747rz-Cpwdku_eqpegrv.lrix3fx78gtukqpx3dch00gg940g549cg1e7311008154e8381x26k32e.octmx3dkocig_$/$/$/$/$/$/$";
            case "13":
                return "https://c-8oqtgrjgwu46x24f3w7r5n6yrca5mx2eenqwfhtqpvx2epgv.g00.gamepedia.com/g00/3_c-8qx78gtycvej.icogrgfkc.eqo_/c-8OQTGRJGWU46x24jvvrux3ax2fx2ff3w7r5n6yrca5m.enqwfhtqpv.pgvx2fqx78gtycvej_icogrgfkcx2fvjwodx2ffx2ffgx2fXqnumcac_Kpfwuvtkgu.lrix2f747rz-Xqnumcac_Kpfwuvtkgu.lrix3fx78gtukqpx3d4c650f9dc35ehhhhh693ed8dgc126377x26k32e.octmx3dkocig_$/$/$/$/$/$/$";
            case "14":
                return "https://c-8oqtgrjgwu46x24f3w7r5n6yrca5mx2eenqwfhtqpvx2epgv.g00.gamepedia.com/g00/3_c-8qx78gtycvej.icogrgfkc.eqo_/c-8OQTGRJGWU46x24jvvrux3ax2fx2ff3w7r5n6yrca5m.enqwfhtqpv.pgvx2fqx78gtycvej_icogrgfkcx2fvjwodx2f0x2f0dx2fIkdtcnvct.lrix2f747rz-Ikdtcnvct.lrix3fx78gtukqpx3df0d8h06gfhg62g65g35h358gh93ef913x26k32e.octmx3dkocig_$/$/$/$/$/$/$";
            case "15":
                return "https://c-8oqtgrjgwu46x24f3w7r5n6yrca5mx2eenqwfhtqpvx2epgv.g00.gamepedia.com/g00/3_c-8qx78gtycvej.icogrgfkc.eqo_/c-8OQTGRJGWU46x24jvvrux3ax2fx2ff3w7r5n6yrca5m.enqwfhtqpv.pgvx2fqx78gtycvej_icogrgfkcx2fvjwodx2f2x2f22x2fGeqrqkpv_Cpvctevkec_DnkbbEqp_4238.rpix2f747rz-Geqrqkpv_Cpvctevkec_DnkbbEqp_4238.rpix3fx78gtukqpx3d99g877e33346018131199c7h0f578h63x26k32e.octmx3dkocig_$/$/$/$/$/$/$";
            default:
                return "";
        }    }


}
