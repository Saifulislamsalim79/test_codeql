package org.org.org.org.internal.app.settings;

import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.asm.asm.Item;
import org.org.org.org.asm.http.InterfaceC14604i;
import org.org.org.org.asm.menu.Object;
import org.org.org.org.asm.nonstiff.InterfaceC14610a;
import org.org.org.org.asm.p598ec.ECFieldElement;
import org.org.org.org.org.data.Label;
import org.org.org.org.org.p602ui.login.State;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* loaded from: classes.dex */
public final class ClassWriter implements Object {

    /* renamed from: B */
    public String f32440B;

    /* renamed from: H */
    public final String f32441H;

    /* renamed from: L */
    public final boolean f32442L;

    /* renamed from: N */
    public boolean f32443N;

    /* renamed from: a */
    public final String f32444a;
    public final String author;

    /* renamed from: b */
    public long f32445b;

    /* renamed from: c */
    public long f32446c;

    /* renamed from: d */
    public final String f32447d;
    public final String date;

    /* renamed from: e */
    public final String f32448e;

    /* renamed from: f */
    public final String f32449f;

    /* renamed from: g */
    public final String f32450g;

    /* renamed from: h */
    public final String f32451h;

    /* renamed from: i */
    public final String f32452i;
    public final String item;
    public final String key;
    public final String name;

    /* renamed from: q */
    public String f32453q;

    /* renamed from: r */
    public float f32454r;

    /* renamed from: s */
    public String f32455s;
    public final String state;

    /* renamed from: t */
    public final String f32456t;
    public final String title;

    /* renamed from: v */
    public final String f32457v;
    public final String version;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ClassWriter(InterfaceC14604i interfaceC14604i, InterfaceC14610a interfaceC14610a, ECFieldElement eCFieldElement, Label label) {
        Log_OC.getArray(interfaceC14604i, "metadataUtil");
        Log_OC.getArray(interfaceC14610a, "systemStatsUtil");
        Log_OC.getArray(eCFieldElement, "displayUtil");
        Log_OC.getArray(label, "configurationHandler");
        this.f32456t = "Android";
        String $r5 = interfaceC14604i.getText();
        this.f32450g = $r5;
        String $r52 = interfaceC14604i.getResources();
        this.f32449f = $r52;
        String $r53 = interfaceC14604i.mo1094h();
        this.f32452i = $r53;
        String $r54 = interfaceC14604i.getOrder();
        this.f32451h = $r54;
        String $r55 = interfaceC14604i.mo1096b();
        this.f32444a = $r55;
        String $r56 = interfaceC14604i.mo1095e();
        this.f32448e = $r56;
        String $r57 = interfaceC14604i.add();
        this.state = $r57;
        String $r58 = interfaceC14604i.decode();
        this.key = $r58;
        String $r59 = interfaceC14604i.getString();
        this.name = $r59;
        String $r510 = interfaceC14604i.update();
        this.version = $r510;
        String $r511 = interfaceC14604i.get();
        this.date = $r511;
        String $r512 = interfaceC14604i.getItem();
        this.item = $r512;
        String $r513 = interfaceC14604i.mo1097a();
        this.author = $r513;
        String $r514 = interfaceC14604i.getTitle();
        this.title = $r514;
        String $r515 = interfaceC14604i.close();
        this.f32457v = $r515;
        String $r516 = interfaceC14604i.getIcon();
        this.f32447d = $r516;
        String $r517 = interfaceC14604i.getVersion();
        this.f32441H = $r517;
        boolean $z0 = interfaceC14610a.getContents();
        this.f32442L = $z0;
        boolean $z02 = interfaceC14610a.close();
        this.f32443N = $z02;
        String $r518 = interfaceC14604i.getLanguageCode();
        this.f32453q = $r518;
        float $f0 = eCFieldElement.init();
        this.f32454r = $f0;
        StringBuilder $r6 = new StringBuilder();
        float $f02 = eCFieldElement.get();
        int $i0 = (int) $f02;
        $r6.append($i0);
        $r6.append('x');
        float $f03 = eCFieldElement.newUTF8();
        int $i02 = (int) $f03;
        $r6.append($i02);
        String $r519 = $r6.toString();
        this.f32455s = $r519;
        Item $r7 = interfaceC14610a.mo1081a();
        long $l1 = $r7.get();
        this.f32446c = $l1;
        Item $r72 = interfaceC14610a.mo1081a();
        long $l12 = $r72.m1140a();
        this.f32445b = $l12;
        State $r8 = label.getState();
        String $r520 = $r8.get();
        this.f32440B = $r520;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.menu.Object
    public JSONObject equals() {
        JSONObject $r1 = new JSONObject();
        String $r3 = this.f32456t;
        $r1.put("platform", $r3);
        String $r32 = this.f32450g;
        $r1.put("sdk_version", $r32);
        String $r33 = this.f32449f;
        $r1.put("sdk_build_id", $r33);
        String $r34 = this.f32452i;
        $r1.put("sdk_build_type", $r34);
        String $r35 = this.f32451h;
        $r1.put("sdk_build_flavor", $r35);
        String $r36 = this.f32444a;
        $r1.put("sdk_framework", $r36);
        String $r37 = this.f32448e;
        $r1.put("sdk_framework_version", $r37);
        String $r38 = this.state;
        $r1.put("sdk_framework_plugin_version", $r38);
        String $r39 = this.key;
        $r1.put("device", $r39);
        String $r310 = this.name;
        $r1.put("os_version", $r310);
        String $r311 = this.version;
        $r1.put("os", $r311);
        String $r312 = this.date;
        $r1.put("userAgent", $r312);
        String $r313 = this.item;
        $r1.put("fingerprint", $r313);
        String $r314 = this.author;
        $r1.put("userid", $r314);
        String $r315 = this.title;
        $r1.put("timezone", $r315);
        String $r316 = this.f32457v;
        $r1.put("bundle_id", $r316);
        String $r317 = this.f32447d;
        $r1.put("app_version_code", $r317);
        String $r318 = this.f32441H;
        $r1.put("app_version_name", $r318);
        boolean $z0 = this.f32442L;
        $r1.put("is_emulator", $z0);
        boolean $z02 = this.f32443N;
        $r1.put("is_rooted", $z02);
        String $r319 = this.f32453q;
        $r1.put(IjkMediaMeta.IJKM_KEY_LANGUAGE, $r319);
        float $f0 = this.f32454r;
        Float $r2 = Float.valueOf($f0);
        $r1.put("screen_density", $r2);
        String $r320 = this.f32455s;
        $r1.put("screen_resolution", $r320);
        long $l0 = this.f32446c;
        $r1.put("total_memory", $l0);
        long $l02 = this.f32445b;
        $r1.put("total_heap_memory", $l02);
        String $r321 = this.f32440B;
        $r1.put("rendering_player_mode", $r321);
        return $r1;
    }
}
