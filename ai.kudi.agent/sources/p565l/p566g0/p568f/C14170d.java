package p565l.p566g0.p568f;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p565l.p566g0.C14148c;
/* compiled from: HttpDate.java */
/* renamed from: l.g0.f.d */
/* loaded from: classes3.dex */
public final class C14170d {

    /* renamed from: a */
    private static final ThreadLocal<DateFormat> f30987a = new C14171a();

    /* renamed from: b */
    private static final String[] f30988b;

    /* renamed from: c */
    private static final DateFormat[] f30989c;

    /* compiled from: HttpDate.java */
    /* renamed from: l.g0.f.d$a */
    /* loaded from: classes3.dex */
    class C14171a extends ThreadLocal<DateFormat> {
        C14171a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(C14148c.f30918n);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f30988b = strArr;
        f30989c = new DateFormat[strArr.length];
    }

    /* renamed from: a */
    public static String m2732a(Date date) {
        return f30987a.get().format(date);
    }

    /* renamed from: b */
    public static Date m2731b(String str) {
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = f30987a.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        synchronized (f30988b) {
            int length = f30988b.length;
            for (int i = 0; i < length; i++) {
                DateFormat dateFormat = f30989c[i];
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(f30988b[i], Locale.US);
                    dateFormat.setTimeZone(C14148c.f30918n);
                    f30989c[i] = dateFormat;
                }
                parsePosition.setIndex(0);
                Date parse2 = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            return null;
        }
    }
}
