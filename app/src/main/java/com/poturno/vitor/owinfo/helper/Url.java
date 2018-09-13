package com.poturno.vitor.owinfo.helper;

public class Url {

    public static final String HEROES_LIST = "https://overwatch-api.net/api/v1/hero";
    public static final String MAPS_LIST = "https://overwatch-api.net/api/v1/map";
    public static final String GAME_MODE = "https://overwatch-api.net/api/v1/game-mode";
    public static final String BRAWL = "https://overwatch-api.net/api/v1/brawl-type";
    public static final String PLATFORM = "https://overwatch-api.net/api/v1/platform";
    public static final String WEB_PAGE = "https://playoverwatch.com";

    public static String mapDetail(String id) {
        return MAPS_LIST + "/" + id;
    }

    public static String heroDetail(String id) {
        return HEROES_LIST + "/" + id;
    }

    public static String getSmallHeroImg(String id) {
        switch (id) {
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

    public static String getBigHeroImg(String id) {
        switch (id) {
            case "1":
                return "https://c-7npsfqifvt34x24e2v6q4m5x78qbz4lx2edmpvegspoux2eofu.g00.gamepedia.com/g00/3_c-7pwfsx78budi.hbnfqfejb.dpn_/c-7NPSFQIFVT34x24iuuqtx3ax2fx2fe2v6q4m5x78qbz4l.dmpvegspou.ofux2fpwfsx78budi_hbnfqfejbx2fuivncx2f8x2f87x2fBob.qohx2f326qy-Bob.qohx3fwfstjpox3d5e966705752c4e3ebbg2c1c0ecg70c36x26j21d.nbslx3djnbhf_$/$/$/$/$/$/$";
            case "2":
                return "https://c-7npsfqifvt34x24e2v6q4m5x78qbz4lx2edmpvegspoux2eofu.g00.gamepedia.com/g00/3_c-7pwfsx78budi.hbnfqfejb.dpn_/c-7NPSFQIFVT34x24iuuqtx3ax2fx2fe2v6q4m5x78qbz4l.dmpvegspou.ofux2fpwfsx78budi_hbnfqfejbx2fuivncx2fex2fe1x2fCbtujpo-qpsusbju.qohx2f509qy-Cbtujpo-qpsusbju.qohx3fwfstjpox3df388ff2144030b9fcg334bc728gc9dfex26j21d.nbslx3djnbhf_$/$/$/$/$/$/$";
            case "3":
                return "https://c-7npsfqifvt34x24e2v6q4m5x78qbz4lx2edmpvegspoux2eofu.g00.gamepedia.com/g00/3_c-7pwfsx78budi.hbnfqfejb.dpn_/c-7NPSFQIFVT34x24iuuqtx3ax2fx2fe2v6q4m5x78qbz4l.dmpvegspou.ofux2fpwfsx78budi_hbnfqfejbx2fuivncx2fcx2fc1x2fEWb-qpsusbju.qohx2f615qy-EWb-qpsusbju.qohx3fwfstjpox3de5d86539e71c85e4252b007794c17b2dx26j21d.nbslx3djnbhf_$/$/$/$/$/$/$";
            case "4":
                return "https://c-7npsfqifvt34x24e2v6q4m5x78qbz4lx2edmpvegspoux2eofu.g00.gamepedia.com/g00/3_c-7pwfsx78budi.hbnfqfejb.dpn_/c-7NPSFQIFVT34x24iuuqtx3ax2fx2fe2v6q4m5x78qbz4l.dmpvegspou.ofux2fpwfsx78budi_hbnfqfejbx2fuivncx2fex2fe9x2fHfokj-qpsusbju.qohx2f594qy-Hfokj-qpsusbju.qohx3fwfstjpox3d395f8d3d20g89971d320g73egd289bc2x26j21d.nbslx3djnbhf_$/$/$/$/$/$/$";
            case "5":
                return "https://c-7npsfqifvt34x24e2v6q4m5x78qbz4lx2edmpvegspoux2eofu.g00.gamepedia.com/g00/3_c-7pwfsx78budi.hbnfqfejb.dpn_/c-7NPSFQIFVT34x24iuuqtx3ax2fx2fe2v6q4m5x78qbz4l.dmpvegspou.ofux2fpwfsx78budi_hbnfqfejbx2fuivncx2fbx2fb1x2fIboap-qpsusbju.qohx2f546qy-Iboap-qpsusbju.qohx3fwfstjpox3db832294c93b1c7b4efc4970d9g5280ddx26j21d.nbslx3djnbhf_$/$/$/$/$/$/$";
            case "6":
                return "https://c-7npsfqifvt34x24e2v6q4m5x78qbz4lx2edmpvegspoux2eofu.g00.gamepedia.com/g00/3_c-7pwfsx78budi.hbnfqfejb.dpn_/c-7NPSFQIFVT34x24iuuqtx3ax2fx2fe2v6q4m5x78qbz4l.dmpvegspou.ofux2fpwfsx78budi_hbnfqfejbx2fuivncx2f0x2f00x2fKvolsbu-Qpsusbju.qohx2f541qy-Kvolsbu-Qpsusbju.qohx3fwfstjpox3d675b40e85g96048f7497626f0f92d581x26j21d.nbslx3djnbhf_$/$/$/$/$/$/$";
            case "7":
                return "https://c-7npsfqifvt34x24e2v6q4m5x78qbz4lx2edmpvegspoux2eofu.g00.gamepedia.com/g00/3_c-7pwfsx78budi.hbnfqfejb.dpn_/c-7NPSFQIFVT34x24iuuqtx3ax2fx2fe2v6q4m5x78qbz4l.dmpvegspou.ofux2fpwfsx78budi_hbnfqfejbx2fuivncx2f9x2f9dx2fMvdjp-qpsusbju.qohx2f394qy-Mvdjp-qpsusbju.qohx3fwfstjpox3d86c8902fe1720ef4gcee347g41d375gdx26j21d.nbslx3djnbhf_$/$/$/$/$/$/$";
            case "8":
                return "https://c-7npsfqifvt34x24e2v6q4m5x78qbz4lx2edmpvegspoux2eofu.g00.gamepedia.com/g00/3_c-7pwfsx78budi.hbnfqfejb.dpn_/c-7NPSFQIFVT34x24iuuqtx3ax2fx2fe2v6q4m5x78qbz4l.dmpvegspou.ofux2fpwfsx78budi_hbnfqfejbx2fuivncx2fex2fe3x2fNddsff-qpsusbju.qohx2f407qy-Nddsff-qpsusbju.qohx3fwfstjpox3d111b02g488ge3e7b00be54fe7g5cd74dx26j21d.nbslx3djnbhf_$/$/$/$/$/$/$";
            case "9":
                return "https://c-7npsfqifvt34x24e2v6q4m5x78qbz4lx2edmpvegspoux2eofu.g00.gamepedia.com/g00/3_c-7pwfsx78budi.hbnfqfejb.dpn_/c-7NPSFQIFVT34x24iuuqtx3ax2fx2fe2v6q4m5x78qbz4l.dmpvegspou.ofux2fpwfsx78budi_hbnfqfejbx2fuivncx2fex2fe1x2fNfj-qpsusbju.qohx2f305qy-Nfj-qpsusbju.qohx3fwfstjpox3d7f4e03fg71g6468f78e456479c07f645x26j21d.nbslx3djnbhf_$/$/$/$/$/$/$";
            case "10":
                return "https://c-7npsfqifvt34x24e2v6q4m5x78qbz4lx2edmpvegspoux2eofu.g00.gamepedia.com/g00/3_c-7pwfsx78budi.hbnfqfejb.dpn_/c-7NPSFQIFVT34x24iuuqtx3ax2fx2fe2v6q4m5x78qbz4l.dmpvegspou.ofux2fpwfsx78budi_hbnfqfejbx2fuivncx2fex2fe3x2fNfsdz-qpsusbju.qohx2f636qy-Nfsdz-qpsusbju.qohx3fwfstjpox3df6geg6d3c4be09c759d696cc742f6ed5x26j21d.nbslx3djnbhf_$/$/$/$/$/$/$";
            case "11":
                return "https://c-7npsfqifvt34x24e2v6q4m5x78qbz4lx2edmpvegspoux2eofu.g00.gamepedia.com/g00/3_c-7pwfsx78budi.hbnfqfejb.dpn_/c-7NPSFQIFVT34x24iuuqtx3ax2fx2fe2v6q4m5x78qbz4l.dmpvegspou.ofux2fpwfsx78budi_hbnfqfejbx2fuivncx2f3x2f37x2fQibsbi-qpsusbju.qohx2f512qy-Qibsbi-qpsusbju.qohx3fwfstjpox3d9802d4854c81b05b299eg77gdc90cfe3x26j21d.nbslx3djnbhf_$/$/$/$/$/$/$";
            case "12":
                return "https://c-7npsfqifvt34x24e2v6q4m5x78qbz4lx2edmpvegspoux2eofu.g00.gamepedia.com/g00/3_c-7pwfsx78budi.hbnfqfejb.dpn_/c-7NPSFQIFVT34x24iuuqtx3ax2fx2fe2v6q4m5x78qbz4l.dmpvegspou.ofux2fpwfsx78budi_hbnfqfejbx2fuivncx2f8x2f85x2fSfbqfs-qpsusbju.qohx2f510qy-Sfbqfs-qpsusbju.qohx3fwfstjpox3d061e14bee65888bffeg52403gfc7908cx26j21d.nbslx3djnbhf_$/$/$/$/$/$/$";
            case "13":
                return "https://c-7npsfqifvt34x24e2v6q4m5x78qbz4lx2edmpvegspoux2eofu.g00.gamepedia.com/g00/3_c-7pwfsx78budi.hbnfqfejb.dpn_/c-7NPSFQIFVT34x24iuuqtx3ax2fx2fe2v6q4m5x78qbz4l.dmpvegspou.ofux2fpwfsx78budi_hbnfqfejbx2fuivncx2f1x2f18x2fSfjoibseu-qpsusbju.qohx2f636qy-Sfjoibseu-qpsusbju.qohx3fwfstjpox3dcf8d3ff0c6gg5dg310f7c9c696296gg1x26j21d.nbslx3djnbhf_$/$/$/$/$/$/$";
            case "14":
                return "https://c-7npsfqifvt34x24e2v6q4m5x78qbz4lx2edmpvegspoux2eofu.g00.gamepedia.com/g00/3_c-7pwfsx78budi.hbnfqfejb.dpn_/c-7NPSFQIFVT34x24iuuqtx3ax2fx2fe2v6q4m5x78qbz4l.dmpvegspou.ofux2fpwfsx78budi_hbnfqfejbx2fuivncx2fdx2fdfx2fSpbeiph-Qpsusbju.qohx2f628qy-Spbeiph-Qpsusbju.qohx3fwfstjpox3d8d808823ge54e07597d6gcf94573b1g8x26j21d.nbslx3djnbhf_$/$/$/$/$/$/$";
            case "15":
                return "https://c-7npsfqifvt34x24e2v6q4m5x78qbz4lx2edmpvegspoux2eofu.g00.gamepedia.com/g00/3_c-7pwfsx78budi.hbnfqfejb.dpn_/c-7NPSFQIFVT34x24iuuqtx3ax2fx2fe2v6q4m5x78qbz4l.dmpvegspou.ofux2fpwfsx78budi_hbnfqfejbx2fuivncx2ffx2ff1x2fTpmejfs87-qpsusbju.qohx2f446qy-Tpmejfs87-qpsusbju.qohx3fwfstjpox3db0484d73gfd129140d9f5142g8e68ee9x26j21d.nbslx3djnbhf_$/$/$/$/$/$/$";
            case "16":
                return "https://c-7npsfqifvt34x24e2v6q4m5x78qbz4lx2edmpvegspoux2eofu.g00.gamepedia.com/g00/3_c-7pwfsx78budi.hbnfqfejb.dpn_/c-7NPSFQIFVT34x24iuuqtx3ax2fx2fe2v6q4m5x78qbz4l.dmpvegspou.ofux2fpwfsx78budi_hbnfqfejbx2fuivncx2f2x2f29x2fTznnfusb-qpsusbju.qohx2f353qy-Tznnfusb-qpsusbju.qohx3fwfstjpox3d2b3e11fef87e4b8ff4f5d86cdd03dg20x26j21d.nbslx3djnbhf_$/$/$/$/$/$/$";
            case "17":
                return "https://c-7npsfqifvt34x24e2v6q4m5x78qbz4lx2edmpvegspoux2eofu.g00.gamepedia.com/g00/3_c-7pwfsx78budi.hbnfqfejb.dpn_/c-7NPSFQIFVT34x24iuuqtx3ax2fx2fe2v6q4m5x78qbz4l.dmpvegspou.ofux2fpwfsx78budi_hbnfqfejbx2fuivncx2fdx2fd6x2fUpsckpso-qpsusbju.qohx2f636qy-Upsckpso-qpsusbju.qohx3fwfstjpox3d7e900b4f7c7gdebg1e52445d728gd6ccx26j21d.nbslx3djnbhf_$/$/$/$/$/$/$";
            case "18":
                return "https://c-7npsfqifvt34x24e2v6q4m5x78qbz4lx2edmpvegspoux2eofu.g00.gamepedia.com/g00/3_c-7pwfsx78budi.hbnfqfejb.dpn_/c-7NPSFQIFVT34x24iuuqtx3ax2fx2fe2v6q4m5x78qbz4l.dmpvegspou.ofux2fpwfsx78budi_hbnfqfejbx2fuivncx2f9x2f92x2fUsbdfs-qpsusbju.qohx2f365qy-Usbdfs-qpsusbju.qohx3fwfstjpox3d9d124dfcd97d94fe6b53dcc53f8ee623x26j21d.nbslx3djnbhf_$/$/$/$/$/$/$";
            case "19":
                return "https://c-7npsfqifvt34x24e2v6q4m5x78qbz4lx2edmpvegspoux2eofu.g00.gamepedia.com/g00/3_c-7pwfsx78budi.hbnfqfejb.dpn_/c-7NPSFQIFVT34x24iuuqtx3ax2fx2fe2v6q4m5x78qbz4l.dmpvegspou.ofux2fpwfsx78budi_hbnfqfejbx2fuivncx2f5x2f5dx2fXjepx78nblfs-qpsusbju.qohx2f444qy-Xjepx78nblfs-qpsusbju.qohx3fwfstjpox3db30cc3b8cfg0c63d09dbe0cbg36b9f26x26j21d.nbslx3djnbhf_$/$/$/$/$/$/$";
            case "20":
                return "https://c-7npsfqifvt34x24e2v6q4m5x78qbz4lx2edmpvegspoux2eofu.g00.gamepedia.com/g00/3_c-7pwfsx78budi.hbnfqfejb.dpn_/c-7NPSFQIFVT34x24iuuqtx3ax2fx2fe2v6q4m5x78qbz4l.dmpvegspou.ofux2fpwfsx78budi_hbnfqfejbx2fuivncx2fcx2fc9x2fXjotupo-qpsusbju.qohx2f636qy-Xjotupo-qpsusbju.qohx3fwfstjpox3d93c310e25e79f54e238b6383284gd9bcx26j21d.nbslx3djnbhf_$/$/$/$/$/$/$";
            case "21":
                return "https://c-7npsfqifvt34x24e2v6q4m5x78qbz4lx2edmpvegspoux2eofu.g00.gamepedia.com/g00/3_c-7pwfsx78budi.hbnfqfejb.dpn_/c-7NPSFQIFVT34x24iuuqtx3ax2fx2fe2v6q4m5x78qbz4l.dmpvegspou.ofux2fpwfsx78budi_hbnfqfejbx2fuivncx2f7x2f7ex2fAbszb-qpsusbju.qohx2f636qy-Abszb-qpsusbju.qohx3fwfstjpox3d3g578b27583f5925282gb9b135f886ccx26j21d.nbslx3djnbhf_$/$/$/$/$/$/$";
            case "22":
                return "https://c-7npsfqifvt34x24e2v6q4m5x78qbz4lx2edmpvegspoux2eofu.g00.gamepedia.com/g00/3_c-7pwfsx78budi.hbnfqfejb.dpn_/c-7NPSFQIFVT34x24iuuqtx3ax2fx2fe2v6q4m5x78qbz4l.dmpvegspou.ofux2fpwfsx78budi_hbnfqfejbx2fuivncx2f0x2f03x2fAfozbuub-qpsusbju.qohx2f515qy-Afozbuub-qpsusbju.qohx3fwfstjpox3df9ef982c058fbc3d60130bf1583058cfx26j21d.nbslx3djnbhf_$/$/$/$/$/$/$";
            case "23":
                return "https://c-7npsfqifvt34x24e2v6q4m5x78qbz4lx2edmpvegspoux2eofu.g00.gamepedia.com/g00/3_c-7pwfsx78budi.hbnfqfejb.dpn_/c-7NPSFQIFVT34x24iuuqtx3ax2fx2fe2v6q4m5x78qbz4l.dmpvegspou.ofux2fpwfsx78budi_hbnfqfejbx2fuivncx2fdx2fd6x2fTpncsb-qpsusbju.qohx2f636qy-Tpncsb-qpsusbju.qohx3fwfstjpox3d0631219c40f4cd4g259550938bebg5d6x26j21d.nbslx3djnbhf_$/$/$/$/$/$/$";
            case "24":
                return "https://c-7npsfqifvt34x24e2v6q4m5x78qbz4lx2edmpvegspoux2eofu.g00.gamepedia.com/g00/3_c-7pwfsx78budi.hbnfqfejb.dpn_/c-7NPSFQIFVT34x24iuuqtx3ax2fx2fe2v6q4m5x78qbz4l.dmpvegspou.ofux2fpwfsx78budi_hbnfqfejbx2fuivncx2f7x2f77x2fPsjtb-qpsusbju.qohx2f636qy-Psjtb-qpsusbju.qohx3fwfstjpox3d0496e2356e462b90b032c8730fff2327x26j21d.nbslx3djnbhf_$/$/$/$/$/$/$";
            default:
                return "";
        }
    }

    public static String getMapSmallImg(String id) {
        switch (id) {
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
        }
    }

    public static String getMapImgDetail(String id){
        switch (id) {
            case "1":
                return "https://4.bp.blogspot.com/-W4PZ_qJiS8Q/V3m0ADhddBI/AAAAAAAAPWU/S1ZXxy4aqqkAzC62CSiaxP5tI11_kA-BgCLcB/s1600/dorado.png";
            case "2":
                return "https://image.redbull.com/rbcom/010/2016-08-31/1331815127129_2/0100/0/1/a-rocket-powered-payload-for-a-supercharged-map.jpg";
            case "3":
                return "https://theobjective.gg/wp-content/uploads/2017/03/Estado_das_Ras1.jpg";
            case "4":
                return "https://i2.wp.com/movingthepayload.com/wp-content/uploads/2017/10/Hanamura_FirstPoint.png?resize=735%2C413&ssl=1";
            case "5":
                return "https://vignette.wikia.nocookie.net/overwatch/images/c/cb/Hollywood_screenshot_9.jpg/revision/latest/scale-to-width-down/640?cb=20160605012430";
            case "6":
                return "https://www.google.com/imgres?imgurl=http%3A%2F%2Fvignette4.wikia.nocookie.net%2Foverwatch%2Fimages%2Fe%2Fe6%2FIlios_screenshot_11.png%2Frevision%2Flatest%3Fcb%3D20160712053958&imgrefurl=https%3A%2F%2Fguides.cheatcc.com%2Foverwatch-guide-walkthrough%2Fguide_sections%2Filios&docid=VYW6-0FfC02kbM&tbnid=XM_krkptAvTx-M%3A&vet=10ahUKEwiO2Zq8w7jdAhXRqZAKHW7GBs8QMwg8KAQwBA..i&w=3000&h=1687&bih=905&biw=1278&q=Ilios%20control%20overwatch&ved=0ahUKEwiO2Zq8w7jdAhXRqZAKHW7GBs8QMwg8KAQwBA&iact=mrc&uact=8";
            case "7":
                return "https://vignette.wikia.nocookie.net/overwatch/images/7/75/Kings_Row_007.jpg/revision/latest?cb=20141108195824";
            case "8":
                return "https://pm1.narvii.com/6346/79dfb488a93f26891a1b39ee230c9624fb7737e7_hq.jpg";
            case "9":
                return "https://23hqvk1n0nuw1j9s413q5mtv-wpengine.netdna-ssl.com/wp-content/uploads/2017/08/payload-e1502991691845.jpg";
            case "10":
                return "https://static.icy-veins.com/images/overwatch/game-mode-hybrid.jpg";
            case "11":
                return "https://vignette.wikia.nocookie.net/overwatch/images/6/62/Nepal_screenshot_16.png/revision/latest?cb=20160711233016";
            case "12":
                return "https://assets.tentonhammer.com/articles/attached_images/000/025/035/medium/TempleOfAnubis.jpg?1468378034";
            case "13":
                return "https://vignette.wikia.nocookie.net/overwatch/images/c/ce/Volskaya11.jpg/revision/latest?cb=20160629221459&path-prefix=pt-br";
            case "14":
                return "https://cdnb.artstation.com/p/assets/images/images/007/539/317/large/andrew-klimas-watchpoint-gibraltar-01.jpg?1506852800";
            case "15":
                return "https://blog.gamersensei.com/wp-content/uploads/2016/12/wsi-imageoptim-ow_ice_02.jpg";
            default:
                return "";
        }
    }


}
