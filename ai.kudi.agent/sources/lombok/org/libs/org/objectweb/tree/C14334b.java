package lombok.org.libs.org.objectweb.tree;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import lombok.org.libs.org.objectweb.asm.C14332b;
import lombok.org.libs.org.objectweb.asm.asm.Handle;
import lombok.org.libs.org.objectweb.asm.asm.signature.AbstractC14331h;
import lombok.org.libs.org.objectweb.asm.asm.signature.C14329a;
import lombok.org.libs.org.objectweb.asm.asm.signature.C14330d;
import org.json.JSONObject;
import org.org.org.org.asm.Frame;
import org.org.org.org.asm.http.InterfaceC14604i;
import org.org.org.org.asm.nonstiff.InterfaceC14610a;
import org.org.org.org.asm.p598ec.ECFieldElement;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
import org.org.org.org.internal.C14627c;
import org.org.org.org.internal.InterfaceC14622a;
import org.org.org.org.internal.app.settings.ClassWriter;
import org.org.org.org.org.common.C14642f;
import org.org.org.org.org.common.telemetry.C14648h;
import org.org.org.org.org.common.telemetry.C14649i;
import org.org.org.org.org.common.telemetry.Item;
import org.org.org.org.org.menu.InterfaceC14715i;
import org.org.org.org.org.nonstiff.InterfaceC14716a;
@Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0005\u000e*BO\u0012\u0006\u0010(\u001a\u00020&\u0012\u0006\u0010;\u001a\u000209\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00108\u001a\u000205\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010?\u001a\u00020<\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u00104\u001a\u000201¢\u0006\u0004\b@\u0010AJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u0005\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0005\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0005\u0010\u0014J\u0017\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0005\u0010\u000fJ\u0017\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0005\u0010\u0016J\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u000e\u0010\u0018J1\u0010\u0005\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u001c\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0004\u0012\u00020\u001b0\u0019H\u0016¢\u0006\u0004\b\u0005\u0010\u001dR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010;\u001a\u0002098\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010:R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006B"}, m10421d2 = {"La/a/b/a/b/e/c;", "La/a/b/a/b/e/b;", "La/a/b/a/e/d/b/b;", TransactionBreakDownItemType.DATA, "La/a/b/a/b/e/c$c;", "a", "(La/a/b/a/e/d/b/b;)La/a/b/a/b/e/c$c;", "", "sid", "La/a/b/a/c/m/e/b;", "record", "La/a/b/a/b/d/d/g/c;", "(Ljava/lang/String;La/a/b/a/c/m/e/b;)La/a/b/a/b/d/d/g/c;", "vid", "b", "(Ljava/lang/String;)La/a/b/a/b/d/d/g/c;", "sessionName", "", "recordIndex", "La/a/b/a/b/d/d/g/a;", "(Ljava/lang/String;I)La/a/b/a/b/d/d/g/a;", "recordJson", "(La/a/b/a/c/m/e/b;)La/a/b/a/b/d/d/g/c;", "sessionId", "(Ljava/lang/String;I)Ljava/lang/String;", "Lkotlin/Function1;", "La/a/b/a/b/d/d/f;", "", "result", "(La/a/b/a/e/d/b/b;Lkotlin/jvm/functions/Function1;)V", "La/a/b/a/f/s/c;", "h", "La/a/b/a/f/s/c;", "displayUtil", "La/a/b/a/c/k/a;", "f", "La/a/b/a/c/k/a;", "referrerHandler", "La/a/b/a/b/c;", "La/a/b/a/b/c;", "server", "La/a/b/a/c/f/a;", "c", "La/a/b/a/c/f/a;", "configurationHandler", "La/a/b/a/c/m/a;", "e", "La/a/b/a/c/m/a;", "identificationHandler", "La/a/b/a/f/b0/a;", "i", "La/a/b/a/f/b0/a;", "systemStatsUtil", "La/a/b/a/c/n/c;", "d", "La/a/b/a/c/n/c;", "sdkStorageHandler", "La/a/b/a/b/a;", "La/a/b/a/b/a;", "restHandler", "La/a/b/a/f/y/a;", "g", "La/a/b/a/f/y/a;", "metadataUtil", "<init>", "(La/a/b/a/b/c;La/a/b/a/b/a;La/a/b/a/c/f/a;La/a/b/a/c/n/c;La/a/b/a/c/m/a;La/a/b/a/c/k/a;La/a/b/a/f/y/a;La/a/b/a/f/s/c;La/a/b/a/f/b0/a;)V", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
/* renamed from: lombok.org.libs.org.objectweb.tree.b */
/* loaded from: classes.dex */
public final class C14334b implements InterfaceC14336i {

    /* renamed from: a */
    public final InterfaceC14715i f31596a;

    /* renamed from: b */
    public final InterfaceC14716a f31597b;

    /* renamed from: c */
    public final InterfaceC14610a f31598c;

    /* renamed from: d */
    public final InterfaceC14604i f31599d;

    /* renamed from: f */
    public final ECFieldElement f31600f;

    /* renamed from: h */
    public final C14627c f31601h;

    /* renamed from: j */
    public final InterfaceC14622a f31602j;

    /* renamed from: k */
    public final org.org.org.org.org.data.Label f31603k;

    /* renamed from: l */
    public final C14642f f31604l;

    public C14334b(C14627c c14627c, InterfaceC14622a interfaceC14622a, org.org.org.org.org.data.Label label, InterfaceC14715i interfaceC14715i, C14642f c14642f, InterfaceC14716a interfaceC14716a, InterfaceC14604i interfaceC14604i, ECFieldElement eCFieldElement, InterfaceC14610a interfaceC14610a) {
        Log_OC.getArray(c14627c, "server");
        Log_OC.getArray(interfaceC14622a, "restHandler");
        Log_OC.getArray(label, "configurationHandler");
        Log_OC.getArray(interfaceC14715i, "sdkStorageHandler");
        Log_OC.getArray(c14642f, "identificationHandler");
        Log_OC.getArray(interfaceC14716a, "referrerHandler");
        Log_OC.getArray(interfaceC14604i, "metadataUtil");
        Log_OC.getArray(eCFieldElement, "displayUtil");
        Log_OC.getArray(interfaceC14610a, "systemStatsUtil");
        this.f31601h = c14627c;
        this.f31602j = interfaceC14622a;
        this.f31603k = label;
        this.f31596a = interfaceC14715i;
        this.f31604l = c14642f;
        this.f31597b = interfaceC14716a;
        this.f31599d = interfaceC14604i;
        this.f31600f = eCFieldElement;
        this.f31598c = interfaceC14610a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final C14329a m2094a(String str, int i) {
        InterfaceC14715i $r3 = this.f31596a;
        File $r1 = $r3.add(false, str, i);
        C14329a $r4 = new C14329a("video_data", $r1);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final C14330d m2095a(String str) {
        C14330d $r2 = new C14330d("eventData", str);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final C14330d m2093a(String str, Item item) {
        JSONObject $r6 = new JSONObject();
        $r6.put("id", str);
        $r6.put("props", (Object) null);
        InterfaceC14604i $r8 = this.f31599d;
        InterfaceC14610a $r1 = this.f31598c;
        ECFieldElement $r2 = this.f31600f;
        org.org.org.org.org.data.Label $r3 = this.f31603k;
        ClassWriter $r7 = new ClassWriter($r8, $r1, $r2, $r3);
        JSONObject $r9 = $r7.equals();
        $r6.put("internalProps", $r9);
        $r6.put("privateProps", (Object) null);
        $r6.put("type", "mobile");
        Frame $r10 = Frame.f32306h;
        long $l0 = item.getTitle();
        String $r4 = $r10.get($l0);
        $r6.put("timeStart", $r4);
        Long $r11 = item.size();
        if ($r11 != null) {
            long $l02 = $r11.longValue();
            String $r42 = $r10.get($l02);
            $r6.put("timeClose", $r42);
        }
        InterfaceC14604i $r82 = this.f31599d;
        String $r43 = $r82.get();
        $r6.put("userAgent", $r43);
        InterfaceC14716a $r12 = this.f31597b;
        String $r44 = $r12.mo541a();
        $r6.put("referer", $r44);
        String $r45 = $r6.toString();
        Log_OC.loadImage($r45, "sessionDataJson.toString()");
        C14330d $r13 = new C14330d("sessionData", $r45);
        return $r13;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final Label m2092a(org.org.org.org.xml.core.util.Label label) throws c$b$a {
        List $r14;
        List $r19;
        String $r3 = label.m448a();
        int $i0 = label.m446c();
        String $r4 = m2091b($r3, $i0);
        C14649i $r5 = Item.f32545b;
        JSONObject $r6 = new JSONObject($r4);
        Item $r7 = $r5.m890b($r6);
        String $r8 = label.m447b();
        String $r9 = label.m448a();
        C14332b $r10 = C14332b.f31591a;
        String $r32 = label.getName();
        String $r33 = $r10.m2104d($r32);
        C14330d $r12 = onCreateView($r8);
        C14330d $r122 = m2093a($r9, $r7);
        C14330d $r123 = onCreate($r7);
        C14330d $r124 = m2095a($r4);
        String $r42 = label.m448a();
        int $i02 = label.m446c();
        C14329a $r13 = m2094a($r42, $i02);
        AbstractC14331h[] $r11 = {$r12, $r122, $r123, $r124, $r13};
        $r14 = C13726r.m3888h($r11);
        org.org.org.org.org.data.Label $r17 = this.f31603k;
        lombok.org.libs.org.objectweb.asm.asm.Label $r16 = new lombok.org.libs.org.objectweb.asm.asm.Label("key", $r17.getText());
        lombok.org.libs.org.objectweb.asm.asm.Label $r162 = new lombok.org.libs.org.objectweb.asm.asm.Label("group", label.getColor());
        lombok.org.libs.org.objectweb.asm.asm.Label $r163 = new lombok.org.libs.org.objectweb.asm.asm.Label("rid", $r7.getId());
        C14627c $r18 = this.f31601h;
        lombok.org.libs.org.objectweb.asm.asm.Label $r164 = new lombok.org.libs.org.objectweb.asm.asm.Label("serverHost", $r18.m995a());
        lombok.org.libs.org.objectweb.asm.asm.Label $r165 = new lombok.org.libs.org.objectweb.asm.asm.Label("writerHost", label.getName());
        lombok.org.libs.org.objectweb.asm.asm.Label[] $r15 = {$r16, $r162, $r163, $r164, $r165};
        $r19 = C13726r.m3888h($r15);
        Label $r1 = new Label($r33, $r14, $r19);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    private final String m2091b(String str, int i) throws c$b$a {
        InterfaceC14715i $r1 = this.f31596a;
        String $r2 = $r1.mo551b(str, i);
        if ($r2 != null) {
            return $r2;
        }
        c$b$a $r3 = c$b$a.HORIZONTAL;
        throw $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final C14330d onCreate(Item item) {
        JSONObject $r2 = new JSONObject();
        int $i0 = item.getType();
        $r2.put("index", $i0);
        String $r3 = item.getId();
        $r2.put("id", $r3);
        Frame $r4 = Frame.f32306h;
        long $l1 = item.set();
        String $r32 = $r4.get($l1);
        $r2.put("timeStart", $r32);
        long $l12 = item.getTimestamp();
        String $r33 = $r4.get($l12);
        $r2.put("timeClose", $r33);
        boolean $z0 = item.execute();
        $r2.put("isLast", $z0);
        int $i02 = item.getStatus();
        $r2.put("deviceWidth", $i02);
        int $i03 = item.getTag();
        $r2.put("deviceHeight", $i03);
        String $r34 = $r2.toString();
        Log_OC.loadImage($r34, "recordDataJson.toString()");
        C14330d $r5 = new C14330d("recordData", $r34);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final C14330d onCreateView(String str) {
        C14642f $r2 = this.f31604l;
        C14648h $r3 = $r2.m934a(str);
        JSONObject $r4 = new JSONObject();
        $r4.put("id", str);
        $r4.put("uid", $r3.m897c());
        JSONObject $r5 = $r3.m900a();
        $r4.put("props", $r5);
        String $r1 = $r4.toString();
        Log_OC.loadImage($r1, "visitorDataJson.toString()");
        C14330d $r6 = new C14330d("visitorData", $r1);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // lombok.org.libs.org.objectweb.tree.InterfaceC14336i
    /* renamed from: a */
    public void mo2089a(org.org.org.org.xml.core.util.Label label, InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(label, TransactionBreakDownItemType.DATA);
        Log_OC.getArray(interfaceC11767l, "result");
        try {
            Label $r3 = m2092a(label);
            System $r4 = System.f32375c;
            LogAspect $r5 = LogAspect.RECORD;
            LogSeverity $r6 = LogSeverity.DEBUG;
            TopLevel$NativeErrors $r7 = $r4.get($r5, true, $r6);
            int $i0 = $r7.ordinal();
            if ($i0 == 0) {
                StringBuilder $r8 = new StringBuilder();
                StringBuilder $r9 = new StringBuilder();
                $r9.append("uploadRecordingData() ");
                $r9.append("sessionId = ");
                String $r10 = label.m448a();
                $r9.append($r10);
                $r9.append(", ");
                $r9.append("recordIndex = ");
                int $i02 = label.m446c();
                $r9.append($i02);
                $r9.append(", ");
                $r9.append("bundle = ");
                $r9.append($r3);
                String $r102 = $r9.toString();
                $r8.append($r102);
                $r8.append(", [logAspect: ");
                $r8.append($r5);
                $r8.append(']');
                String $r103 = $r8.toString();
                $r4.size($r5, $r6, "RecordApiHandler", $r103);
            }
            InterfaceC14622a $r11 = this.f31602j;
            String $r104 = $r3.m2097b();
            List $r12 = $r3.m2098a();
            List $r13 = $r3.m2096c();
            ArraysKt___ArraysKt$withIndex$5 $r14 = new ArraysKt___ArraysKt$withIndex$5(interfaceC11767l);
            $r11.mo1024a($r104, $r12, $r13, $r14);
        } catch (Exception $r15) {
            System $r42 = System.f32375c;
            LogAspect $r52 = LogAspect.RECORD;
            LogSeverity $r62 = LogSeverity.DEBUG;
            TopLevel$NativeErrors $r72 = $r42.get($r52, true, $r62);
            int $i03 = $r72.ordinal();
            if ($i03 == 0) {
                StringBuilder $r82 = new StringBuilder();
                StringBuilder $r92 = new StringBuilder();
                $r92.append("uploadRecordingData() could not collect all needed data ");
                $r92.append("sessionId = ");
                String $r105 = label.m448a();
                $r92.append($r105);
                $r92.append(", ");
                $r92.append("recordIndex = ");
                int $i04 = label.m446c();
                $r92.append($i04);
                $r92.append(", ");
                $r92.append("exception = ");
                $r92.append($r15);
                String $r106 = $r92.toString();
                $r82.append($r106);
                $r82.append(", [logAspect: ");
                $r82.append($r52);
                $r82.append(']');
                String $r107 = $r82.toString();
                $r42.size($r52, $r62, "RecordApiHandler", $r107);
            }
            Handle $r16 = new Handle(-1, null, $r15, 2, null);
            interfaceC11767l.invoke($r16);
        }
    }
}
