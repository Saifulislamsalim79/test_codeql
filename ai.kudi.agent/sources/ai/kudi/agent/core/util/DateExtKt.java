package ai.kudi.agent.core.util;

import ai.kudi.agent.filter.p005ui.DateFilterFragment;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13277t;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: DateExt.kt */
@Metadata(m10422d1 = {"\u00008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b\u001a\u0016\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002\u001a\u0016\u0010\f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002\u001a\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u001a\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u001a\u0006\u0010\u0011\u001a\u00020\b\u001a.\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u001a\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u001aF\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000226\u0010\u001a\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00180\u001b\u001a\u0006\u0010 \u001a\u00020\u000e\u001a\u001c\u0010!\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\"\u001a\u00020#\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003¨\u0006$"}, m10421d2 = {"isToday", "", "Ljava/util/Date;", "(Ljava/util/Date;)Z", "isYesterday", "addDaysToDate", AttributeType.DATE, "days", "", "areDifferentDays", "day1", "day2", "areDifferentDays2", "convertDateToGivenFormat", "", IjkMediaMeta.IJKM_KEY_FORMAT, "formatDateForBvn", "getCurrentHourOfDay", "getDateDiff", "fromDate", "toDate", "defaultPreviousDays", "getDateFromDateConstructor", "getFirstAndLastMonthDate", "", "whichDate", "callback", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "first", "last", "greetingUsingHourOfDay", "formatWithStyle", "zone", "Ljava/util/TimeZone;", "core_release"}, k = 2, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class DateExtKt {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final Date addDaysToDate(Date date, int i) {
        Log_OC.getArray(date, AttributeType.DATE);
        GregorianCalendar $r1 = new GregorianCalendar();
        $r1.setTime(date);
        $r1.add(5, i);
        Date $r0 = $r1.getTime();
        Log_OC.loadImage($r0, "cal.time");
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final boolean areDifferentDays(Date date, Date date2) {
        Log_OC.getArray(date, "day1");
        Log_OC.getArray(date2, "day2");
        Locale $r3 = Locale.UK;
        SimpleDateFormat $r2 = new SimpleDateFormat("yyyyMMdd", $r3);
        TimeZone $r4 = TimeZone.getTimeZone("UTC");
        $r2.setTimeZone($r4);
        String $r5 = $r2.format(date);
        String $r6 = $r2.format(date2);
        boolean $z0 = Log_OC.append($r5, $r6);
        return !$z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final boolean areDifferentDays2(Date date, Date date2) {
        Log_OC.getArray(date, "day1");
        Log_OC.getArray(date2, "day2");
        Locale $r3 = Locale.getDefault();
        SimpleDateFormat $r2 = new SimpleDateFormat("yyyyMMdd", $r3);
        String $r4 = $r2.format(date);
        String $r5 = $r2.format(date2);
        boolean $z0 = Log_OC.append($r4, $r5);
        return !$z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final String convertDateToGivenFormat(Date date, String str) {
        Log_OC.getArray(date, AttributeType.DATE);
        Log_OC.getArray(str, IjkMediaMeta.IJKM_KEY_FORMAT);
        Locale $r3 = Locale.getDefault();
        SimpleDateFormat $r2 = new SimpleDateFormat(str, $r3);
        String $r1 = $r2.format(date);
        Log_OC.loadImage($r1, "fmt.format(date)");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static /* synthetic */ String convertDateToGivenFormat$default(Date date, String $r1, int i, Object obj) {
        int $i0 = i & 2;
        if ($i0 != 0) {
            $r1 = "dd MMMM, yyyy";
        }
        return convertDateToGivenFormat(date, $r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final String formatDateForBvn(Date date, String str) {
        List $r4;
        String $r2;
        String $r22;
        Log_OC.getArray(date, AttributeType.DATE);
        Log_OC.getArray(str, IjkMediaMeta.IJKM_KEY_FORMAT);
        try {
            String $r23 = convertDateToGivenFormat(date, str);
            String[] $r3 = {"/"};
            $r4 = C13277t.m5383r0($r23, $r3, false, 0, 6, null);
            StringBuilder $r5 = new StringBuilder();
            Object $r6 = $r4.get(0);
            String $r24 = (String) $r6;
            $r5.append($r24);
            $r5.append('-');
            Object $r62 = $r4.get(1);
            String $r25 = (String) $r62;
            $r2 = C13277t.m5390k0($r25, "0");
            $r5.append($r2);
            $r5.append('-');
            Object $r63 = $r4.get(2);
            String $r26 = (String) $r63;
            $r22 = C13277t.m5390k0($r26, "0");
            $r5.append($r22);
            String $r27 = $r5.toString();
            return $r27;
        } catch (Throwable th) {
            return "";
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static /* synthetic */ String formatDateForBvn$default(Date date, String $r1, int i, Object obj) {
        int $i0 = i & 2;
        if ($i0 != 0) {
            $r1 = "dd MMMM, yyyy";
        }
        return formatDateForBvn(date, $r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final String formatWithStyle(Date date, String str, TimeZone timeZone) {
        Log_OC.getArray(date, "<this>");
        Log_OC.getArray(str, IjkMediaMeta.IJKM_KEY_FORMAT);
        Log_OC.getArray(timeZone, "zone");
        SimpleDateFormat $r3 = new SimpleDateFormat(str);
        $r3.setTimeZone(timeZone);
        String $r0 = $r3.format(date);
        return $r0 != null ? $r0 : "";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static /* synthetic */ String formatWithStyle$default(Date date, String str, TimeZone $r3, int i, Object obj) {
        int $i0 = i & 2;
        if ($i0 != 0) {
            TimeZone $r4 = TimeZone.getTimeZone("UTC");
            $r3 = $r4;
            Log_OC.loadImage($r4, "getTimeZone(\"UTC\")");
        }
        String $r0 = formatWithStyle(date, str, $r3);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final int getCurrentHourOfDay() {
        Calendar $r0 = Calendar.getInstance();
        int $i0 = $r0.get(11);
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final String getDateDiff(Date date, Date date2, int i, String str) {
        Log_OC.getArray(date, "fromDate");
        Log_OC.getArray(date2, "toDate");
        Log_OC.getArray(str, IjkMediaMeta.IJKM_KEY_FORMAT);
        int $i0 = -i;
        Date $r1 = addDaysToDate(date, $i0);
        String $r3 = convertDateToGivenFormat($r1, str);
        String $r0 = convertDateToGivenFormat(date2, str);
        return $r3 + " - " + $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static /* synthetic */ String getDateDiff$default(Date $r1, Date $r2, int $i0, String $r0, int i, Object obj) {
        int $i2 = i & 1;
        if ($i2 != 0) {
            $r1 = new Date();
        }
        int $i22 = i & 2;
        if ($i22 != 0) {
            $r2 = new Date();
        }
        int $i23 = i & 4;
        if ($i23 != 0) {
            $i0 = 30;
        }
        int $i1 = i & 8;
        if ($i1 != 0) {
            $r0 = "dd MMM";
        }
        return getDateDiff($r1, $r2, $i0, $r0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final Date getDateFromDateConstructor(String str, String str2) {
        Log_OC.getArray(str, AttributeType.DATE);
        Log_OC.getArray(str2, IjkMediaMeta.IJKM_KEY_FORMAT);
        Locale $r3 = Locale.getDefault();
        SimpleDateFormat $r2 = new SimpleDateFormat(str2, $r3);
        Date $r4 = $r2.parse(str);
        Log_OC.loadImage($r4, "simpleDateFormat.parse(date)");
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static /* synthetic */ Date getDateFromDateConstructor$default(String str, String $r3, int i, Object obj) {
        int $i0 = i & 2;
        if ($i0 != 0) {
            $r3 = DateFilterFragment.WEEK_DAY_DAY_MONTH_YEAR_FORMAT;
        }
        Date $r1 = getDateFromDateConstructor(str, $r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final void getFirstAndLastMonthDate(Date date, InterfaceC11771p interfaceC11771p) {
        Log_OC.getArray(date, "whichDate");
        Log_OC.getArray(interfaceC11771p, "callback");
        Calendar $r2 = Calendar.getInstance();
        $r2.setTime(date);
        $r2.set(5, 1);
        Date $r1 = $r2.getTime();
        int $i0 = $r2.getActualMaximum(5);
        $r2.add(5, $i0 - 1);
        Date $r3 = $r2.getTime();
        Log_OC.loadImage($r1, "firstDate");
        Log_OC.loadImage($r3, "lastDate");
        interfaceC11771p.invoke($r1, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final String greetingUsingHourOfDay() {
        int $i0 = getCurrentHourOfDay();
        boolean $z0 = true;
        boolean $z1 = $i0 >= 0 && $i0 <= 12;
        if ($z1) {
            return "Good Morning";
        }
        $z0 = (12 > $i0 || $i0 > 18) ? false : false;
        return $z0 ? "Good Afternoon" : "Good Evening";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final boolean isToday(Date date) {
        Log_OC.getArray(date, "<this>");
        TimeZone $r1 = TimeZone.getTimeZone("UTC");
        Calendar $r2 = Calendar.getInstance($r1);
        TimeZone $r12 = TimeZone.getTimeZone("UTC");
        Calendar $r3 = Calendar.getInstance($r12);
        $r3.setTime(date);
        int $i0 = $r3.get(1);
        int $i1 = $r2.get(1);
        if ($i0 == $i1) {
            int $i02 = $r3.get(6);
            int $i12 = $r2.get(6);
            return $i02 == $i12;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final boolean isYesterday(Date date) {
        Log_OC.getArray(date, "<this>");
        TimeZone $r1 = TimeZone.getTimeZone("UTC");
        Calendar $r2 = Calendar.getInstance($r1);
        TimeZone $r12 = TimeZone.getTimeZone("UTC");
        Calendar $r3 = Calendar.getInstance($r12);
        $r3.setTime(date);
        int $i0 = $r3.get(1);
        int $i1 = $r2.get(1);
        if ($i0 == $i1) {
            int $i02 = $r3.get(6);
            int $i12 = $r2.get(6);
            return $i02 == $i12 - 1;
        }
        return false;
    }
}
