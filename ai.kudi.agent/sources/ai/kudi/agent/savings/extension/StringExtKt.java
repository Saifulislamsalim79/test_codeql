package ai.kudi.agent.savings.extension;

import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.core.util.IntExtKt;
import ai.kudi.agent.savings.C0456R;
import ai.kudi.agent.savings.adapter.SavingsPlanAdapter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13253c;
import kotlin.p549l0.C13276s;
import kotlin.p549l0.C13277t;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: StringExt.kt */
@Metadata(m10422d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0001\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0001\u001a\n\u0010\t\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\n\u001a\u00020\u0007*\u00020\u0001\u001a\n\u0010\u000b\u001a\u00020\u0007*\u00020\u0001\u001a\u0012\u0010\f\u001a\u00020\r*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m10421d2 = {"DESIRED_FORMAT", "", "FORMAT", "FORMAT_SLASH", "capFirstLetter", "daysAfter", "duration", "", "formatDuration", "reformatDate", "statusBackground", "statusTextColor", "toDate", "Ljava/util/Date;", IjkMediaMeta.IJKM_KEY_FORMAT, "feature-savings_release"}, k = 2, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class StringExtKt {
    private static final String DESIRED_FORMAT = "d MMM yyyy";
    private static final String FORMAT = "yyyy-MM-dd";
    private static final String FORMAT_SLASH = "yyyy/MM/dd";

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final String capFirstLetter(String str) {
        String $r3;
        Log_OC.getArray(str, "<this>");
        Locale $r1 = Locale.ROOT;
        String $r0 = str.toLowerCase($r1);
        Log_OC.loadImage($r0, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
        int $i0 = $r0.length();
        boolean $z0 = $i0 > 0;
        if ($z0) {
            StringBuilder $r2 = new StringBuilder();
            char $c1 = $r0.charAt(0);
            $r3 = C13253c.m5543g($c1);
            $r2.append($r3.toString());
            if ($r0 == null) {
                NullPointerException $r4 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                throw $r4;
            }
            String $r02 = $r0.substring(1);
            Log_OC.loadImage($r02, "(this as java.lang.String).substring(startIndex)");
            $r2.append($r02);
            return $r2.toString();
        }
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final String daysAfter(String str, int i) {
        Log_OC.getArray(str, "<this>");
        Calendar $r1 = Calendar.getInstance();
        Locale $r3 = Locale.getDefault();
        SimpleDateFormat $r2 = new SimpleDateFormat(FORMAT, $r3);
        String $r0 = str.toString();
        Date $r4 = $r2.parse($r0);
        Date $r5 = $r4;
        if ($r4 == null) {
            $r5 = new Date();
        }
        $r1.setTime($r5);
        $r1.add(6, i);
        Date $r42 = $r1.getTime();
        Log_OC.loadImage($r42, "cal.time");
        String $r02 = DateExtKt.formatWithStyle$default($r42, DESIRED_FORMAT, null, 2, null);
        return $r02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
        r11 = kotlin.p549l0.C13277t.m5389l0(r12, ai.kudi.agent.core.util.IntExtKt.Days);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String daysAfter(java.lang.String r11, java.lang.String r12) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.p483e0.p485d.Log_OC.getArray(r11, r0)
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r0 = "yyyy/MM/dd"
            r2.<init>(r0, r3)
            java.lang.String r11 = r11.toString()
            java.util.Date r4 = r2.parse(r11)
            r5 = r4
            if (r4 != 0) goto L24
            java.util.Date r5 = new java.util.Date
            r5.<init>()
        L24:
            r1.setTime(r5)
            if (r12 != 0) goto L2b
        L29:
            r6 = 0
            goto L3c
        L2b:
            java.lang.String r0 = " days"
            java.lang.String r11 = kotlin.p549l0.C13265j.m5479l0(r12, r0)
            if (r11 != 0) goto L34
            goto L29
        L34:
            int r7 = java.lang.Integer.parseInt(r11)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
        L3c:
            if (r6 != 0) goto L40
            r7 = 0
            goto L44
        L40:
            int r7 = r6.intValue()
        L44:
            r8 = 6
            r1.add(r8, r7)
            java.util.Date r4 = r1.getTime()
            java.lang.String r0 = "cal.time"
            kotlin.p483e0.p485d.Log_OC.loadImage(r4, r0)
            java.lang.String r0 = "d MMM yyyy"
            r9 = 0
            r8 = 2
            r10 = 0
            java.lang.String r11 = ai.kudi.agent.core.util.DateExtKt.formatWithStyle$default(r4, r0, r9, r8, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.savings.extension.StringExtKt.daysAfter(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final int formatDuration(String str) {
        String $r0;
        Log_OC.getArray(str, "<this>");
        $r0 = C13277t.m5389l0(str, IntExtKt.Days);
        int $i0 = Integer.parseInt($r0);
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final String reformatDate(String str) {
        String $r0;
        Log_OC.getArray(str, "<this>");
        $r0 = C13276s.m5451A(str, "/", "-", false, 4, null);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final int statusBackground(String str) {
        Log_OC.getArray(str, "<this>");
        SavingsPlanAdapter.SavingStatus $r1 = SavingsPlanAdapter.SavingStatus.COMPLETED;
        String $r2 = $r1.name();
        boolean $z0 = Log_OC.append(str, $r2);
        if ($z0) {
            int i0 = C0456R.C0457drawable.bg_complete_status;
            return i0;
        }
        SavingsPlanAdapter.SavingStatus $r12 = SavingsPlanAdapter.SavingStatus.WITHDRAWN;
        String $r22 = $r12.name();
        boolean $z02 = Log_OC.append(str, $r22);
        if ($z02) {
            int i02 = C0456R.C0457drawable.withdraw_saving_bg;
            return i02;
        }
        SavingsPlanAdapter.SavingStatus $r13 = SavingsPlanAdapter.SavingStatus.NOT_STARTED;
        String $r23 = $r13.name();
        boolean $z03 = Log_OC.append(str, $r23);
        if ($z03) {
            int i03 = C0456R.C0457drawable.bg_not_started_status;
            return i03;
        }
        SavingsPlanAdapter.SavingStatus $r14 = SavingsPlanAdapter.SavingStatus.ACTIVE;
        String $r24 = $r14.name();
        boolean $z04 = Log_OC.append(str, $r24);
        if ($z04) {
            int i04 = C0456R.C0457drawable.bg_active_status;
            return i04;
        }
        SavingsPlanAdapter.SavingStatus $r15 = SavingsPlanAdapter.SavingStatus.DEACTIVATED;
        String $r25 = $r15.name();
        boolean $z05 = Log_OC.append(str, $r25);
        if ($z05) {
            int i05 = C0456R.C0457drawable.bg_in_active_status;
            return i05;
        }
        int i06 = C0456R.C0457drawable.bg_in_active_status;
        return i06;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final int statusTextColor(String str) {
        Log_OC.getArray(str, "<this>");
        SavingsPlanAdapter.SavingStatus $r1 = SavingsPlanAdapter.SavingStatus.ACTIVE;
        String $r2 = $r1.name();
        boolean $z0 = Log_OC.append(str, $r2);
        if ($z0) {
            int i0 = C0456R.color.activeStatus;
            return i0;
        }
        SavingsPlanAdapter.SavingStatus $r12 = SavingsPlanAdapter.SavingStatus.WITHDRAWN;
        String $r22 = $r12.name();
        boolean $z02 = Log_OC.append(str, $r22);
        if ($z02) {
            int i02 = C0456R.color.withdrawnStatus;
            return i02;
        }
        SavingsPlanAdapter.SavingStatus $r13 = SavingsPlanAdapter.SavingStatus.COMPLETED;
        String $r23 = $r13.name();
        boolean $z03 = Log_OC.append(str, $r23);
        if ($z03) {
            int i03 = C0456R.color.completeStatus;
            return i03;
        }
        SavingsPlanAdapter.SavingStatus $r14 = SavingsPlanAdapter.SavingStatus.DEACTIVATED;
        String $r24 = $r14.name();
        boolean $z04 = Log_OC.append(str, $r24);
        if ($z04) {
            int i04 = C0456R.color.inactiveStatus;
            return i04;
        }
        SavingsPlanAdapter.SavingStatus $r15 = SavingsPlanAdapter.SavingStatus.NOT_STARTED;
        String $r25 = $r15.name();
        boolean $z05 = Log_OC.append(str, $r25);
        if ($z05) {
            int i05 = C0456R.color.notStartedStatusBackground;
            return i05;
        }
        int i06 = C0456R.color.inactiveStatus;
        return i06;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final Date toDate(String str, String str2) {
        Log_OC.getArray(str, "<this>");
        Log_OC.getArray(str2, IjkMediaMeta.IJKM_KEY_FORMAT);
        Locale $r3 = Locale.getDefault();
        SimpleDateFormat $r2 = new SimpleDateFormat(str2, $r3);
        Date $r4 = $r2.parse(str);
        return $r4 == null ? new Date() : $r4;
    }
}
