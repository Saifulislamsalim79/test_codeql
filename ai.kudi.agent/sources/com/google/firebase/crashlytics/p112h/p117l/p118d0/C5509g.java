package com.google.firebase.crashlytics.p112h.p117l.p118d0;

import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import android.util.Base64;
import android.util.JsonReader;
import com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0;
import com.google.firebase.crashlytics.p112h.p117l.C5426a;
import com.google.firebase.crashlytics.p112h.p117l.C5492b0;
import com.google.firebase.encoders.InterfaceC5960a;
import com.google.firebase.encoders.p142h.C5973d;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: CrashlyticsReportJsonTransform.java */
/* renamed from: com.google.firebase.crashlytics.h.l.d0.g */
/* loaded from: classes2.dex */
public class C5509g {

    /* renamed from: a */
    private static final InterfaceC5960a f13560a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CrashlyticsReportJsonTransform.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.d0.g$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC5510a<T> {
        /* renamed from: a */
        T mo24655a(JsonReader jsonReader) throws IOException;
    }

    static {
        C5973d c5973d = new C5973d();
        c5973d.m23160g(C5426a.f13397a);
        c5973d.m23159h(true);
        f13560a = c5973d.m23161f();
    }

    /* renamed from: A */
    private static AbstractC5448a0 m24686A(JsonReader jsonReader) throws IOException {
        AbstractC5448a0.AbstractC5451b m24761b = AbstractC5448a0.m24761b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c = 7;
                        break;
                    }
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c = 0;
                        break;
                    }
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 4;
                        break;
                    }
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c = 1;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m24761b.mo24716h(jsonReader.nextString());
                    break;
                case 1:
                    m24761b.mo24720d(jsonReader.nextString());
                    break;
                case 2:
                    m24761b.mo24717g(jsonReader.nextInt());
                    break;
                case 3:
                    m24761b.mo24719e(jsonReader.nextString());
                    break;
                case 4:
                    m24761b.mo24722b(jsonReader.nextString());
                    break;
                case 5:
                    m24761b.mo24721c(jsonReader.nextString());
                    break;
                case 6:
                    m24761b.mo24715i(m24685B(jsonReader));
                    break;
                case 7:
                    m24761b.mo24718f(m24657y(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m24761b.mo24723a();
    }

    /* renamed from: B */
    private static AbstractC5448a0.AbstractC5458e m24685B(JsonReader jsonReader) throws IOException {
        AbstractC5448a0.AbstractC5458e.AbstractC5462b m24753a = AbstractC5448a0.AbstractC5458e.m24753a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -2128794476:
                    if (nextName.equals("startedAt")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1606742899:
                    if (nextName.equals("endedAt")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1335157162:
                    if (nextName.equals("device")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -1291329255:
                    if (nextName.equals("events")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        c = 7;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3599307:
                    if (nextName.equals("user")) {
                        c = 5;
                        break;
                    }
                    break;
                case 286956243:
                    if (nextName.equals("generator")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1025385094:
                    if (nextName.equals("crashed")) {
                        c = 4;
                        break;
                    }
                    break;
                case 2047016109:
                    if (nextName.equals("generatorType")) {
                        c = '\n';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m24753a.mo24626g(jsonReader.nextString());
                    break;
                case 1:
                    m24753a.m24748j(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 2:
                    m24753a.mo24622l(jsonReader.nextLong());
                    break;
                case 3:
                    m24753a.mo24628e(Long.valueOf(jsonReader.nextLong()));
                    break;
                case 4:
                    m24753a.mo24630c(jsonReader.nextBoolean());
                    break;
                case 5:
                    m24753a.mo24621m(m24684C(jsonReader));
                    break;
                case 6:
                    m24753a.mo24631b(m24673i(jsonReader));
                    break;
                case 7:
                    m24753a.mo24623k(m24656z(jsonReader));
                    break;
                case '\b':
                    m24753a.mo24629d(m24669m(jsonReader));
                    break;
                case '\t':
                    m24753a.mo24627f(m24671k(jsonReader, C5504b.f13555a));
                    break;
                case '\n':
                    m24753a.mo24625h(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m24753a.mo24632a();
    }

    /* renamed from: C */
    private static AbstractC5448a0.AbstractC5458e.AbstractC5487f m24684C(JsonReader jsonReader) throws IOException {
        AbstractC5448a0.AbstractC5458e.AbstractC5487f.AbstractC5488a m24733a = AbstractC5448a0.AbstractC5458e.AbstractC5487f.m24733a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            if (nextName.hashCode() == -1618432855 && nextName.equals("identifier")) {
                c = 0;
            }
            if (c != 0) {
                jsonReader.skipValue();
            } else {
                m24733a.mo24479b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return m24733a.mo24480a();
    }

    /* renamed from: i */
    private static AbstractC5448a0.AbstractC5458e.AbstractC5459a m24673i(JsonReader jsonReader) throws IOException {
        AbstractC5448a0.AbstractC5458e.AbstractC5459a.AbstractC5460a m24749a = AbstractC5448a0.AbstractC5458e.AbstractC5459a.m24749a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c = 0;
                        break;
                    }
                    break;
                case -519438642:
                    if (nextName.equals("developmentPlatform")) {
                        c = 4;
                        break;
                    }
                    break;
                case 213652010:
                    if (nextName.equals("developmentPlatformVersion")) {
                        c = 5;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c = 1;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                m24749a.mo24609e(jsonReader.nextString());
            } else if (c == 1) {
                m24749a.mo24607g(jsonReader.nextString());
            } else if (c == 2) {
                m24749a.mo24610d(jsonReader.nextString());
            } else if (c == 3) {
                m24749a.mo24608f(jsonReader.nextString());
            } else if (c == 4) {
                m24749a.mo24612b(jsonReader.nextString());
            } else if (c != 5) {
                jsonReader.skipValue();
            } else {
                m24749a.mo24611c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return m24749a.mo24613a();
    }

    /* renamed from: j */
    private static AbstractC5448a0.AbstractC5449a m24672j(JsonReader jsonReader) throws IOException {
        AbstractC5448a0.AbstractC5449a.AbstractC5450a m24757a = AbstractC5448a0.AbstractC5449a.m24757a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 110987:
                    if (nextName.equals("pid")) {
                        c = 0;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c = 4;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c = 5;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 6;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c = 1;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c = 2;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m24757a.mo24702c(jsonReader.nextInt());
                    break;
                case 1:
                    m24757a.mo24701d(jsonReader.nextString());
                    break;
                case 2:
                    m24757a.mo24699f(jsonReader.nextInt());
                    break;
                case 3:
                    m24757a.mo24703b(jsonReader.nextInt());
                    break;
                case 4:
                    m24757a.mo24700e(jsonReader.nextLong());
                    break;
                case 5:
                    m24757a.mo24698g(jsonReader.nextLong());
                    break;
                case 6:
                    m24757a.mo24697h(jsonReader.nextLong());
                    break;
                case 7:
                    m24757a.mo24696i(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m24757a.mo24704a();
    }

    /* renamed from: k */
    private static <T> C5492b0<T> m24671k(JsonReader jsonReader, InterfaceC5510a<T> interfaceC5510a) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(interfaceC5510a.mo24655a(jsonReader));
        }
        jsonReader.endArray();
        return C5492b0.m24714d(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static AbstractC5448a0.AbstractC5452c m24670l(JsonReader jsonReader) throws IOException {
        AbstractC5448a0.AbstractC5452c.AbstractC5453a m24756a = AbstractC5448a0.AbstractC5452c.m24756a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 106079) {
                if (hashCode == 111972721 && nextName.equals("value")) {
                    c = 1;
                }
            } else if (nextName.equals("key")) {
                c = 0;
            }
            if (c == 0) {
                m24756a.mo24688b(jsonReader.nextString());
            } else if (c != 1) {
                jsonReader.skipValue();
            } else {
                m24756a.mo24687c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return m24756a.mo24689a();
    }

    /* renamed from: m */
    private static AbstractC5448a0.AbstractC5458e.AbstractC5463c m24669m(JsonReader jsonReader) throws IOException {
        AbstractC5448a0.AbstractC5458e.AbstractC5463c.AbstractC5464a m24747a = AbstractC5448a0.AbstractC5458e.AbstractC5463c.m24747a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1981332476:
                    if (nextName.equals("simulator")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1969347631:
                    if (nextName.equals("manufacturer")) {
                        c = 7;
                        break;
                    }
                    break;
                case 112670:
                    if (nextName.equals("ram")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c = 0;
                        break;
                    }
                    break;
                case 81784169:
                    if (nextName.equals("diskSpace")) {
                        c = 4;
                        break;
                    }
                    break;
                case 94848180:
                    if (nextName.equals("cores")) {
                        c = 2;
                        break;
                    }
                    break;
                case 104069929:
                    if (nextName.equals("model")) {
                        c = 1;
                        break;
                    }
                    break;
                case 109757585:
                    if (nextName.equals(SendReceiptToTerminalConfirmationBottomSheet.STATE)) {
                        c = 6;
                        break;
                    }
                    break;
                case 2078953423:
                    if (nextName.equals("modelClass")) {
                        c = '\b';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m24747a.mo24595b(jsonReader.nextInt());
                    break;
                case 1:
                    m24747a.mo24591f(jsonReader.nextString());
                    break;
                case 2:
                    m24747a.mo24594c(jsonReader.nextInt());
                    break;
                case 3:
                    m24747a.mo24589h(jsonReader.nextLong());
                    break;
                case 4:
                    m24747a.mo24593d(jsonReader.nextLong());
                    break;
                case 5:
                    m24747a.mo24588i(jsonReader.nextBoolean());
                    break;
                case 6:
                    m24747a.mo24587j(jsonReader.nextInt());
                    break;
                case 7:
                    m24747a.mo24592e(jsonReader.nextString());
                    break;
                case '\b':
                    m24747a.mo24590g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m24747a.mo24596a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static AbstractC5448a0.AbstractC5458e.AbstractC5465d m24668n(JsonReader jsonReader) throws IOException {
        AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5480b m24746a = AbstractC5448a0.AbstractC5458e.AbstractC5465d.m24746a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c = 3;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c = 2;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 1;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                m24746a.mo24576e(jsonReader.nextLong());
            } else if (c == 1) {
                m24746a.mo24575f(jsonReader.nextString());
            } else if (c == 2) {
                m24746a.mo24579b(m24667o(jsonReader));
            } else if (c == 3) {
                m24746a.mo24578c(m24665q(jsonReader));
            } else if (c != 4) {
                jsonReader.skipValue();
            } else {
                m24746a.mo24577d(m24661u(jsonReader));
            }
        }
        jsonReader.endObject();
        return m24746a.mo24580a();
    }

    /* renamed from: o */
    private static AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a m24667o(JsonReader jsonReader) throws IOException {
        AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5467a m24745a = AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.m24745a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1332194002:
                    if (nextName.equals("background")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1090974952:
                    if (nextName.equals("execution")) {
                        c = 2;
                        break;
                    }
                    break;
                case -80231855:
                    if (nextName.equals("internalKeys")) {
                        c = 4;
                        break;
                    }
                    break;
                case 555169704:
                    if (nextName.equals("customAttributes")) {
                        c = 3;
                        break;
                    }
                    break;
                case 928737948:
                    if (nextName.equals("uiOrientation")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                m24745a.mo24567b(Boolean.valueOf(jsonReader.nextBoolean()));
            } else if (c == 1) {
                m24745a.mo24563f(jsonReader.nextInt());
            } else if (c == 2) {
                m24745a.mo24565d(m24664r(jsonReader));
            } else if (c == 3) {
                m24745a.mo24566c(m24671k(jsonReader, C5506d.f13557a));
            } else if (c != 4) {
                jsonReader.skipValue();
            } else {
                m24745a.mo24564e(m24671k(jsonReader, C5506d.f13557a));
            }
        }
        jsonReader.endObject();
        return m24745a.mo24568a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5469a m24666p(JsonReader jsonReader) throws IOException {
        AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5469a.AbstractC5470a m24743a = AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5469a.m24743a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals("uuid")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                m24743a.mo24545c(jsonReader.nextString());
            } else if (c == 1) {
                m24743a.mo24546b(jsonReader.nextLong());
            } else if (c == 2) {
                m24743a.mo24544d(jsonReader.nextLong());
            } else if (c != 3) {
                jsonReader.skipValue();
            } else {
                m24743a.m24741f(Base64.decode(jsonReader.nextString(), 2));
            }
        }
        jsonReader.endObject();
        return m24743a.mo24547a();
    }

    /* renamed from: q */
    private static AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c m24665q(JsonReader jsonReader) throws IOException {
        AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c.AbstractC5482a m24736a = AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c.m24736a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1708606089:
                    if (nextName.equals("batteryLevel")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1455558134:
                    if (nextName.equals("batteryVelocity")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1439500848:
                    if (nextName.equals("orientation")) {
                        c = 4;
                        break;
                    }
                    break;
                case 279795450:
                    if (nextName.equals("diskUsed")) {
                        c = 2;
                        break;
                    }
                    break;
                case 976541947:
                    if (nextName.equals("ramUsed")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1516795582:
                    if (nextName.equals("proximityOn")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                m24736a.mo24499b(Double.valueOf(jsonReader.nextDouble()));
            } else if (c == 1) {
                m24736a.mo24498c(jsonReader.nextInt());
            } else if (c == 2) {
                m24736a.mo24497d(jsonReader.nextLong());
            } else if (c == 3) {
                m24736a.mo24495f(jsonReader.nextBoolean());
            } else if (c == 4) {
                m24736a.mo24496e(jsonReader.nextInt());
            } else if (c != 5) {
                jsonReader.skipValue();
            } else {
                m24736a.mo24494g(jsonReader.nextLong());
            }
        }
        jsonReader.endObject();
        return m24736a.mo24500a();
    }

    /* renamed from: r */
    private static AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b m24664r(JsonReader jsonReader) throws IOException {
        AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5471b m24744a = AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.m24744a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1337936983:
                    if (nextName.equals("threads")) {
                        c = 0;
                        break;
                    }
                    break;
                case -902467928:
                    if (nextName.equals("signal")) {
                        c = 2;
                        break;
                    }
                    break;
                case 937615455:
                    if (nextName.equals("binaries")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1481625679:
                    if (nextName.equals("exception")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                m24744a.mo24552f(m24671k(jsonReader, C5505c.f13556a));
            } else if (c == 1) {
                m24744a.mo24554d(m24663s(jsonReader));
            } else if (c == 2) {
                m24744a.mo24553e(m24660v(jsonReader));
            } else if (c == 3) {
                m24744a.mo24555c(m24671k(jsonReader, C5503a.f13554a));
            } else if (c != 4) {
                jsonReader.skipValue();
            } else {
                m24744a.mo24556b(m24672j(jsonReader));
            }
        }
        jsonReader.endObject();
        return m24744a.mo24557a();
    }

    /* renamed from: s */
    private static AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c m24663s(JsonReader jsonReader) throws IOException {
        AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c.AbstractC5473a m24740a = AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c.m24740a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 1;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 3;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c = 0;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                m24740a.mo24536b(m24663s(jsonReader));
            } else if (c == 1) {
                m24740a.mo24535c(m24671k(jsonReader, C5508f.f13559a));
            } else if (c == 2) {
                m24740a.mo24534d(jsonReader.nextInt());
            } else if (c == 3) {
                m24740a.mo24532f(jsonReader.nextString());
            } else if (c != 4) {
                jsonReader.skipValue();
            } else {
                m24740a.mo24533e(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return m24740a.mo24537a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b m24662t(JsonReader jsonReader) throws IOException {
        AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b.AbstractC5479a m24737a = AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b.m24737a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals(IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET)) {
                        c = 2;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                m24737a.mo24510c(jsonReader.nextInt());
            } else if (c == 1) {
                m24737a.mo24511b(jsonReader.nextString());
            } else if (c == 2) {
                m24737a.mo24509d(jsonReader.nextLong());
            } else if (c == 3) {
                m24737a.mo24508e(jsonReader.nextLong());
            } else if (c != 4) {
                jsonReader.skipValue();
            } else {
                m24737a.mo24507f(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return m24737a.mo24512a();
    }

    /* renamed from: u */
    private static AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5483d m24661u(JsonReader jsonReader) throws IOException {
        AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5483d.AbstractC5484a m24735a = AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5483d.m24735a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            if (nextName.hashCode() == 951530617 && nextName.equals("content")) {
                c = 0;
            }
            if (c != 0) {
                jsonReader.skipValue();
            } else {
                m24735a.mo24491b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return m24735a.mo24492a();
    }

    /* renamed from: v */
    private static AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5474d m24660v(JsonReader jsonReader) throws IOException {
        AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5474d.AbstractC5475a m24739a = AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5474d.m24739a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -1147692044) {
                if (hashCode != 3059181) {
                    if (hashCode == 3373707 && nextName.equals("name")) {
                        c = 0;
                    }
                } else if (nextName.equals("code")) {
                    c = 1;
                }
            } else if (nextName.equals("address")) {
                c = 2;
            }
            if (c == 0) {
                m24739a.mo24525d(jsonReader.nextString());
            } else if (c == 1) {
                m24739a.mo24526c(jsonReader.nextString());
            } else if (c != 2) {
                jsonReader.skipValue();
            } else {
                m24739a.mo24527b(jsonReader.nextLong());
            }
        }
        jsonReader.endObject();
        return m24739a.mo24528a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e m24659w(JsonReader jsonReader) throws IOException {
        AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5477a m24738a = AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.m24738a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -1266514778) {
                if (hashCode != 3373707) {
                    if (hashCode == 2125650548 && nextName.equals("importance")) {
                        c = 0;
                    }
                } else if (nextName.equals("name")) {
                    c = 1;
                }
            } else if (nextName.equals("frames")) {
                c = 2;
            }
            if (c == 0) {
                m24738a.mo24519c(jsonReader.nextInt());
            } else if (c == 1) {
                m24738a.mo24518d(jsonReader.nextString());
            } else if (c != 2) {
                jsonReader.skipValue();
            } else {
                m24738a.mo24520b(m24671k(jsonReader, C5508f.f13559a));
            }
        }
        jsonReader.endObject();
        return m24738a.mo24521a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static AbstractC5448a0.AbstractC5454d.AbstractC5456b m24658x(JsonReader jsonReader) throws IOException {
        AbstractC5448a0.AbstractC5454d.AbstractC5456b.AbstractC5457a m24754a = AbstractC5448a0.AbstractC5454d.AbstractC5456b.m24754a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -734768633) {
                if (hashCode == -567321830 && nextName.equals("contents")) {
                    c = 1;
                }
            } else if (nextName.equals("filename")) {
                c = 0;
            }
            if (c == 0) {
                m24754a.mo24645c(jsonReader.nextString());
            } else if (c != 1) {
                jsonReader.skipValue();
            } else {
                m24754a.mo24646b(Base64.decode(jsonReader.nextString(), 2));
            }
        }
        jsonReader.endObject();
        return m24754a.mo24647a();
    }

    /* renamed from: y */
    private static AbstractC5448a0.AbstractC5454d m24657y(JsonReader jsonReader) throws IOException {
        AbstractC5448a0.AbstractC5454d.AbstractC5455a m24755a = AbstractC5448a0.AbstractC5454d.m24755a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 97434231) {
                if (hashCode == 106008351 && nextName.equals("orgId")) {
                    c = 1;
                }
            } else if (nextName.equals("files")) {
                c = 0;
            }
            if (c == 0) {
                m24755a.mo24651b(m24671k(jsonReader, C5507e.f13558a));
            } else if (c != 1) {
                jsonReader.skipValue();
            } else {
                m24755a.mo24650c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return m24755a.mo24652a();
    }

    /* renamed from: z */
    private static AbstractC5448a0.AbstractC5458e.AbstractC5485e m24656z(JsonReader jsonReader) throws IOException {
        AbstractC5448a0.AbstractC5458e.AbstractC5485e.AbstractC5486a m24734a = AbstractC5448a0.AbstractC5458e.AbstractC5485e.m24734a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 2;
                        break;
                    }
                    break;
                case -293026577:
                    if (nextName.equals("jailbroken")) {
                        c = 3;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                m24734a.mo24483d(jsonReader.nextInt());
            } else if (c == 1) {
                m24734a.mo24482e(jsonReader.nextString());
            } else if (c == 2) {
                m24734a.mo24485b(jsonReader.nextString());
            } else if (c != 3) {
                jsonReader.skipValue();
            } else {
                m24734a.mo24484c(jsonReader.nextBoolean());
            }
        }
        jsonReader.endObject();
        return m24734a.mo24486a();
    }

    /* renamed from: D */
    public AbstractC5448a0 m24683D(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            AbstractC5448a0 m24686A = m24686A(jsonReader);
            jsonReader.close();
            return m24686A;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: E */
    public String m24682E(AbstractC5448a0 abstractC5448a0) {
        return f13560a.mo23152b(abstractC5448a0);
    }

    /* renamed from: a */
    public AbstractC5448a0.AbstractC5458e.AbstractC5465d m24681a(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            AbstractC5448a0.AbstractC5458e.AbstractC5465d m24668n = m24668n(jsonReader);
            jsonReader.close();
            return m24668n;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: b */
    public String m24680b(AbstractC5448a0.AbstractC5458e.AbstractC5465d abstractC5465d) {
        return f13560a.mo23152b(abstractC5465d);
    }
}
