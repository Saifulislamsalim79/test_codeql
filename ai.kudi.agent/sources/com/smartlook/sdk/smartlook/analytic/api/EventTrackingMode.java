package com.smartlook.sdk.smartlook.analytic.api;

import e.a.a.a.a.a.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.e0.d.g;
import kotlin.p557z.C13715n;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13726r;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum FULL_TRACKING uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
@Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m10421d2 = {"Lcom/smartlook/sdk/smartlook/analytic/api/EventTrackingMode;", "Ljava/lang/Enum;", "", "code", "B", "getCode", "()B", "<init>", "(Ljava/lang/String;IB)V", "Companion", "a", "FULL_TRACKING", "IGNORE_USER_INTERACTION", "IGNORE_NAVIGATION_INTERACTION", "IGNORE_RAGE_CLICKS", "NO_TRACKING", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
/* loaded from: classes2.dex */
public final class EventTrackingMode {
    private static final /* synthetic */ EventTrackingMode[] $VALUES;
    public static final C7215a Companion;
    public static final EventTrackingMode FULL_TRACKING;
    public static final EventTrackingMode IGNORE_NAVIGATION_INTERACTION;
    public static final EventTrackingMode IGNORE_RAGE_CLICKS;
    public static final EventTrackingMode IGNORE_USER_INTERACTION;
    public static final EventTrackingMode NO_TRACKING;
    private final byte code;

    @Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u00000\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m10421d2 = {"com/smartlook/sdk/smartlook/analytic/api/EventTrackingMode$a", "", "userMask", "La/a/b/a/a/a/a;", "internalEventMode", "", "", "combinedEventTrackingModeList", "", "a", "(BLa/a/b/a/a/a/a;Ljava/util/List;)V", "byteValue", "Lcom/smartlook/sdk/smartlook/analytic/api/EventTrackingMode;", "(B)Lcom/smartlook/sdk/smartlook/analytic/api/EventTrackingMode;", "b", "(B)Ljava/lang/String;", "", "c", "(B)Ljava/util/List;", "<init>", "()V", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
    /* renamed from: com.smartlook.sdk.smartlook.analytic.api.EventTrackingMode$a */
    /* loaded from: classes2.dex */
    public static final class C7215a {
        private C7215a() {
        }

        /* renamed from: a */
        private final void m19123a(byte b, a aVar, List<String> list) {
            a aVar2 = a.d;
            if (((byte) (((byte) (b ^ aVar2.a())) & aVar.a())) > 0) {
                list.add(m19124a((byte) (aVar2.a() ^ aVar.a())).name());
            }
        }

        /* renamed from: b */
        public final String m19122b(byte b) {
            return m19121c(b).toString();
        }

        /* renamed from: c */
        public final List<EventTrackingMode> m19121c(byte b) {
            List<EventTrackingMode> m3885k;
            List<EventTrackingMode> m3885k2;
            ArrayList arrayList = new ArrayList();
            EventTrackingMode eventTrackingMode = EventTrackingMode.FULL_TRACKING;
            if (b == eventTrackingMode.getCode()) {
                m3885k2 = C13726r.m3885k(eventTrackingMode);
                return m3885k2;
            }
            EventTrackingMode eventTrackingMode2 = EventTrackingMode.NO_TRACKING;
            if (b == eventTrackingMode2.getCode()) {
                m3885k = C13726r.m3885k(eventTrackingMode2);
                return m3885k;
            }
            if (((byte) (a.f.a() & b)) <= 0) {
                arrayList.add(EventTrackingMode.IGNORE_USER_INTERACTION);
            }
            if (((byte) (a.e.a() & b)) <= 0) {
                arrayList.add(EventTrackingMode.IGNORE_NAVIGATION_INTERACTION);
            }
            if (((byte) (b & a.w.a())) <= 0) {
                arrayList.add(EventTrackingMode.IGNORE_RAGE_CLICKS);
                return arrayList;
            }
            return arrayList;
        }

        public /* synthetic */ C7215a(g gVar) {
            this();
        }

        /* renamed from: a */
        private final EventTrackingMode m19124a(byte b) {
            List m4025Z;
            m4025Z = C13715n.m4025Z(EventTrackingMode.values());
            ArrayList arrayList = new ArrayList();
            for (Object obj : m4025Z) {
                if (((EventTrackingMode) obj).getCode() == b) {
                    arrayList.add(obj);
                }
            }
            return (EventTrackingMode) C13722p.m3954R(arrayList);
        }
    }

    static {
        a aVar = a.d;
        EventTrackingMode eventTrackingMode = new EventTrackingMode("FULL_TRACKING", 0, aVar.a());
        FULL_TRACKING = eventTrackingMode;
        EventTrackingMode eventTrackingMode2 = new EventTrackingMode("IGNORE_USER_INTERACTION", 1, (byte) (aVar.a() ^ a.f.a()));
        IGNORE_USER_INTERACTION = eventTrackingMode2;
        EventTrackingMode eventTrackingMode3 = new EventTrackingMode("IGNORE_NAVIGATION_INTERACTION", 2, (byte) (aVar.a() ^ a.e.a()));
        IGNORE_NAVIGATION_INTERACTION = eventTrackingMode3;
        EventTrackingMode eventTrackingMode4 = new EventTrackingMode("IGNORE_RAGE_CLICKS", 3, (byte) (aVar.a() ^ a.w.a()));
        IGNORE_RAGE_CLICKS = eventTrackingMode4;
        EventTrackingMode eventTrackingMode5 = new EventTrackingMode("NO_TRACKING", 4, (byte) 0);
        NO_TRACKING = eventTrackingMode5;
        $VALUES = new EventTrackingMode[]{eventTrackingMode, eventTrackingMode2, eventTrackingMode3, eventTrackingMode4, eventTrackingMode5};
        Companion = new C7215a(null);
    }

    private EventTrackingMode(String str, int i, byte b) {
        this.code = b;
    }

    public static EventTrackingMode valueOf(String str) {
        return (EventTrackingMode) Enum.valueOf(EventTrackingMode.class, str);
    }

    public static EventTrackingMode[] values() {
        return (EventTrackingMode[]) $VALUES.clone();
    }

    public final byte getCode() {
        return this.code;
    }
}
