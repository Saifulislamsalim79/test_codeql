package org.org.org.org.org.common.telemetry;

import e.a.a.a.a.b.f.c;
import e.a.a.a.a.b.f.d;
import e.a.a.a.a.b.f.e;
import e.a.a.a.a.b.f.g;
import e.a.a.a.a.b.f.k;
import e.a.a.a.a.b.f.l;
import e.a.a.a.c.l.e.b;
import java.util.List;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13722p;
import org.json.JSONArray;
import org.json.JSONObject;
import org.org.org.org.android.util.asm.Attribute;
import org.org.org.org.android.util.asm.Buffer;
import org.org.org.org.android.util.asm.C14539c;
import org.org.org.org.android.util.asm.C14547m;
import org.org.org.org.android.util.asm.C14550x;
import org.org.org.org.android.util.asm.Location;
import org.org.org.org.android.util.asm.Node;
import org.org.org.org.android.util.asm.Plot;
import org.org.org.org.android.util.asm.Type;
import org.org.org.org.android.util.menu.EnumC14571f;
import org.org.org.org.asm.Vector3;
import org.org.org.org.asm.asm.Method;
import org.org.org.org.asm.menu.Object;
import org.org.org.org.asm.util.Collection;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* loaded from: classes.dex */
public final class Item implements Object {

    /* renamed from: b */
    public static final C14649i f32545b;

    /* renamed from: a */
    public List<e.a.a.a.a.b.f.i> f32546a;
    public List<e> buffer;

    /* renamed from: c */
    public List<e.a.a.a.a.b.f.h> f32547c;
    public List<b> children;
    public List<d> content;
    public int count;
    public int current;

    /* renamed from: d */
    public List<l> f32548d;
    public List<c> data;

    /* renamed from: e */
    public List<k> f32549e;

    /* renamed from: f */
    public List<e.a.a.a.a.b.f.a> f32550f;

    /* renamed from: g */
    public int f32551g;

    /* renamed from: h */
    public long f32552h;

    /* renamed from: id */
    public final String f32553id;
    public boolean index;
    public int key;
    public List<e.a.a.a.a.d.b.a> name;
    public int next;
    public Long size;
    public long state;

    /* renamed from: t */
    public long f32554t;
    public List<e.a.a.a.c.l.e.e> text;
    public long time;
    public String type;
    public int value;

    /* renamed from: x */
    public List<g> f32555x;

    /* renamed from: y */
    public List<e.a.a.a.a.c.b.b> f32556y;

    /* renamed from: z */
    public List<e.a.a.a.a.b.f.b> f32557z;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C14649i $r0 = new C14649i(null);
        f32545b = $r0;
    }

    public Item() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, 0L, 0L, 0L, null, 0, 0, 0, 0, 0L, 0, 268435455, null);
    }

    public Item(List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, String str, List list14, String str2, int i, boolean z, long j, long j2, long j3, Long l, int i2, int i3, int i4, int i5, long j4, int i6) {
        Log_OC.getArray(list, "multiTouches");
        Log_OC.getArray(list2, "selectors");
        Log_OC.getArray(list3, "rageClicks");
        Log_OC.getArray(list4, "activeViews");
        Log_OC.getArray(list5, "orientationEvents");
        Log_OC.getArray(list6, "keyboardEvents");
        Log_OC.getArray(list7, "interceptedRequests");
        Log_OC.getArray(list8, "connectionEvents");
        Log_OC.getArray(list9, "renderingModeEvents");
        Log_OC.getArray(list10, "eventTrackingModeEvents");
        Log_OC.getArray(list11, "crashEvents");
        Log_OC.getArray(list12, "gestures");
        Log_OC.getArray(list13, "customEvents");
        Log_OC.getArray(list14, "renderingDataList");
        Log_OC.getArray(str2, "recordId");
        this.f32547c = list;
        this.f32548d = list2;
        this.f32549e = list3;
        this.f32550f = list4;
        this.f32546a = list5;
        this.f32555x = list6;
        this.f32556y = list7;
        this.f32557z = list8;
        this.text = list9;
        this.content = list10;
        this.data = list11;
        this.buffer = list12;
        this.name = list13;
        this.type = str;
        this.children = list14;
        this.f32553id = str2;
        this.current = i;
        this.index = z;
        this.state = j;
        this.time = j2;
        this.f32552h = j3;
        this.size = l;
        this.next = i2;
        this.count = i3;
        this.value = i4;
        this.key = i5;
        this.f32554t = j4;
        this.f32551g = i6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Item(java.util.List r68, java.util.List r69, java.util.List r70, java.util.List r71, java.util.List r72, java.util.List r73, java.util.List r74, java.util.List r75, java.util.List r76, java.util.List r77, java.util.List r78, java.util.List r79, java.util.List r80, java.lang.String r81, java.util.List r82, java.lang.String r83, int r84, boolean r85, long r86, long r88, long r90, java.lang.Long r92, int r93, int r94, int r95, int r96, long r97, int r99, int r100, kotlin.p483e0.p485d.DBUtils$1 r101) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.common.telemetry.Item.<init>(java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.lang.String, java.util.List, java.lang.String, int, boolean, long, long, long, java.lang.Long, int, int, int, int, long, int, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final EnumC14571f m908a() {
        List $r1 = this.f32546a;
        Object $r2 = C13722p.m3954R($r1);
        Type $r3 = (Type) $r2;
        EnumC14571f $r4 = $r3.getValue();
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void add(Method method, org.org.org.org.org.core.util.Type type) {
        Log_OC.getArray(method, "screenSize");
        Log_OC.getArray(type, "videoSize");
        int $i0 = method.getValue();
        this.value = $i0;
        int $i02 = method.getName();
        this.key = $i02;
        int $i03 = type.getValue();
        this.next = $i03;
        int $i04 = type.m779a();
        this.count = $i04;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.menu.Object
    public JSONObject equals() {
        JSONObject $r1 = new JSONObject();
        $r1.put("persist_analytics", true);
        $r1.put("schema_version", "1.0.0");
        List $r2 = this.f32547c;
        JSONArray $r3 = Collection.add($r2);
        $r1.put("multi_touches", $r3);
        List $r22 = this.f32548d;
        JSONArray $r32 = Collection.add($r22);
        $r1.put("selector_events", $r32);
        List $r23 = this.f32549e;
        JSONArray $r33 = Collection.add($r23);
        $r1.put("rage_click_events", $r33);
        List $r24 = this.f32550f;
        JSONArray $r34 = Collection.add($r24);
        $r1.put("vc_appear_events", $r34);
        List $r25 = this.f32546a;
        JSONArray $r35 = Collection.add($r25);
        $r1.put("orientation_events", $r35);
        List $r26 = this.f32555x;
        JSONArray $r36 = Collection.add($r26);
        $r1.put("keyboard_events", $r36);
        List $r27 = this.f32556y;
        JSONArray $r37 = Collection.add($r27);
        $r1.put("requests", $r37);
        List $r28 = this.f32557z;
        JSONArray $r38 = Collection.add($r28);
        $r1.put("connection_events", $r38);
        List $r29 = this.text;
        JSONArray $r39 = Collection.add($r29);
        $r1.put("rendering_mode_events", $r39);
        List $r210 = this.children;
        JSONArray $r310 = Collection.add($r210);
        $r1.put("rendering_data", $r310);
        List $r211 = this.content;
        JSONArray $r311 = Collection.add($r211);
        $r1.put("event_tracking_mode_events", $r311);
        List $r212 = this.data;
        JSONArray $r312 = Collection.add($r212);
        $r1.put("crash_events", $r312);
        List $r213 = this.buffer;
        JSONArray $r313 = Collection.add($r213);
        $r1.put("gestures", $r313);
        List $r214 = this.name;
        JSONArray $r314 = Collection.add($r214);
        $r1.put("custom_events", $r314);
        String $r4 = this.type;
        $r1.put("rendering_type", $r4);
        String $r42 = this.f32553id;
        $r1.put("rid", $r42);
        int $i0 = this.current;
        $r1.put("index", $i0);
        boolean $z0 = this.index;
        $r1.put("closing_session", $z0);
        long $l1 = this.state;
        $r1.put("start_timestamp", $l1);
        long $l12 = this.time;
        $r1.put("end_timestamp", $l12);
        long $l13 = this.f32552h;
        $r1.put("session_start_timestamp", $l13);
        Long $r5 = this.size;
        $r1.put("session_end_timestamp", $r5);
        int $i02 = this.value;
        $r1.put("screenX", $i02);
        int $i03 = this.key;
        $r1.put("screenY", $i03);
        int $i04 = this.next;
        $r1.put("videoWidth", $i04);
        int $i05 = this.count;
        $r1.put("videoHeight", $i05);
        long $l14 = this.f32554t;
        $r1.put(IjkMediaMeta.IJKM_KEY_BITRATE, $l14);
        int $i06 = this.f32551g;
        $r1.put("framerate", $i06);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean execute() {
        boolean z0 = this.index;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List get() {
        List r1 = this.f32546a;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.org.org.org.android.util.menu.EnumC14571f get(long r14) {
        /*
            r13 = this;
            java.util.List<e.a.a.a.a.b.f.i> r0 = r13.f32546a
            int r1 = r0.size()
            java.util.ListIterator r2 = r0.listIterator(r1)
        La:
            boolean r3 = r2.hasPrevious()
            if (r3 == 0) goto L2a
            java.lang.Object r4 = r2.previous()
            r6 = r4
            org.org.org.org.android.util.asm.Type r6 = (org.org.org.org.android.util.asm.Type) r6
            r5 = r6
            long r7 = r5.getName()
            int r9 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r9 >= 0) goto L22
            r3 = 1
            goto L23
        L22:
            r3 = 0
        L23:
            if (r3 == 0) goto La
            org.org.org.org.android.util.menu.f r10 = r5.getValue()
            return r10
        L2a:
            java.util.NoSuchElementException r11 = new java.util.NoSuchElementException
            java.lang.String r12 = "List contains no element matching the predicate."
            r11.<init>(r12)
            goto L32
        L32:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.common.telemetry.Item.get(long):org.org.org.org.android.util.menu.f");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getCategories() {
        List r1 = this.f32556y;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getChildren() {
        List r1 = this.children;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getContent() {
        List r1 = this.content;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getData() {
        List r1 = this.f32549e;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getHref() {
        List r1 = this.f32557z;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getId() {
        String r1 = this.f32553id;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getKey() {
        List r1 = this.data;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getLabels() {
        List r1 = this.f32555x;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getMembers() {
        List r1 = this.f32547c;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getName() {
        List r1 = this.name;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getOrder() {
        List r1 = this.f32548d;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getStatus() {
        int i0 = this.value;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getTag() {
        int i0 = this.key;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getText() {
        List r1 = this.text;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final long getTimestamp() {
        long l0 = this.time;
        return l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final long getTitle() {
        long l0 = this.f32552h;
        return l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getType() {
        int i0 = this.current;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getValue() {
        List r1 = this.f32550f;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int insert() {
        int i0 = this.next;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int length() {
        int i0 = this.count;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List remove() {
        List r1 = this.buffer;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean remove(C14547m c14547m) {
        Log_OC.getArray(c14547m, "gesture");
        List $r2 = this.buffer;
        boolean $z0 = $r2.add(c14547m);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean remove(org.org.org.org.org.p602ui.asm.Item item) {
        Log_OC.getArray(item, "renderingData");
        List $r2 = this.children;
        boolean $z0 = $r2.add(item);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String save() {
        String r1 = this.type;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final long set() {
        long l0 = this.state;
        return l0;
    }

    public final void set(String str) {
        this.type = str;
    }

    public final void set(List list) {
        Log_OC.getArray(list, "<set-?>");
        this.f32546a = list;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void set(Attribute attribute) {
        Log_OC.getArray(attribute, "connectionEvent");
        Vector3 $r3 = Vector3.f32313z;
        List $r2 = this.f32557z;
        $r3.add($r2, attribute);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void set(Buffer buffer) {
        Log_OC.getArray(buffer, "eventTrackingModeEvent");
        Vector3 $r3 = Vector3.f32313z;
        List $r2 = this.content;
        $r3.add($r2, buffer);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void set(Plot plot) {
        Log_OC.getArray(plot, "activeView");
        Vector3 $r3 = Vector3.f32313z;
        List $r2 = this.f32550f;
        $r3.add($r2, plot);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void set(org.org.org.org.org.p602ui.asm.Attribute attribute) {
        Log_OC.getArray(attribute, "renderingModeEvent");
        Vector3 $r3 = Vector3.f32313z;
        List $r2 = this.text;
        $r3.add($r2, attribute);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void set(boolean z, long j, List list) {
        Log_OC.getArray(list, "customEvents");
        this.index = z;
        this.time = j;
        List $r3 = this.name;
        $r3.addAll(list);
        if (z) {
            Long $r2 = Long.valueOf(j);
            this.size = $r2;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean set(org.org.org.org.android.http.util.Label label) {
        Log_OC.getArray(label, "interceptedRequest");
        List $r2 = this.f32556y;
        boolean $z0 = $r2.add(label);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean set(org.org.org.org.android.util.asm.Item item) {
        Log_OC.getArray(item, "selector");
        List $r2 = this.f32548d;
        boolean $z0 = $r2.add(item);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean set(Location location) {
        Log_OC.getArray(location, "multitouch");
        List $r2 = this.f32547c;
        boolean $z0 = $r2.add(location);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean set(Node node) {
        Log_OC.getArray(node, "rageClick");
        List $r2 = this.f32549e;
        boolean $z0 = $r2.add(node);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean set(C14539c c14539c) {
        Log_OC.getArray(c14539c, "crashEvent");
        List $r2 = this.data;
        boolean $z0 = $r2.add(c14539c);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean set(C14550x c14550x) {
        Log_OC.getArray(c14550x, "keyboardEvent");
        List $r2 = this.f32555x;
        boolean $z0 = $r2.add(c14550x);
        return $z0;
    }

    public final void setContent(List list) {
        Log_OC.getArray(list, "<set-?>");
        this.content = list;
    }

    public final void setData(List list) {
        Log_OC.getArray(list, "<set-?>");
        this.text = list;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Long size() {
        Long r1 = this.size;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void toString(Type type) {
        Log_OC.getArray(type, "orientationEvent");
        Vector3 $r3 = Vector3.f32313z;
        List $r2 = this.f32546a;
        $r3.add($r2, type);
    }

    public final void update(List list) {
        Log_OC.getArray(list, "<set-?>");
        this.f32557z = list;
    }
}
