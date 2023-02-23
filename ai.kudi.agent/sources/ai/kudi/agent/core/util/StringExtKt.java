package ai.kudi.agent.core.util;

import ai.kudi.agent.core.C0038R;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.savings.adapter.SavingsAdapter;
import ai.kudi.agent.savings.data.model.SavingTransactionItem;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.transactions.utils.IdTypes;
import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.SuperscriptSpan;
import android.view.View;
import androidx.core.content.C1335a;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.C11780a0;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13262h;
import kotlin.p549l0.C13276s;
import kotlin.p549l0.C13277t;
import kotlin.p549l0.C13282v;
import kotlin.p557z.C13727r0;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: StringExt.kt */
@Metadata(m10422d1 = {"\u0000x\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0002\u001a\u0010\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0002\u001a\u000e\u00101\u001a\u00020/2\u0006\u00100\u001a\u00020\u0002\u001a\u000e\u00102\u001a\u00020/2\u0006\u00100\u001a\u00020\u0002\u001a\u000e\u00103\u001a\u00020/2\u0006\u00100\u001a\u00020\u0002\u001a\u0010\u00104\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u00020\u0002\u001a\u000e\u00105\u001a\u00020/2\u0006\u00100\u001a\u00020\u0002\u001a\u001e\u00106\u001a\u00020,2\u0006\u0010-\u001a\u0002072\u0006\u00108\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u0002\u001a&\u0010:\u001a\u00020;*\u00020\u00022\b\b\u0002\u0010<\u001a\u00020\f2\b\b\u0002\u0010=\u001a\u00020\f2\u0006\u0010>\u001a\u00020;\u001aL\u0010?\u001a\u00020;*\u00020\u00022\b\b\u0002\u0010<\u001a\u00020\f2\b\b\u0002\u0010=\u001a\u00020\f2\b\b\u0002\u0010@\u001a\u00020\f2\u0006\u0010A\u001a\u00020B2\u0006\u0010>\u001a\u00020;2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020F0D\u001a$\u0010G\u001a\u00020H*\u00020\u00022\u0006\u0010A\u001a\u00020B2\u0006\u0010I\u001a\u00020\u00022\b\b\u0001\u0010J\u001a\u00020\f\u001a\u001a\u0010K\u001a\u00020\u0002*\u00020\u00022\u0006\u0010L\u001a\u00020\u00022\u0006\u0010M\u001a\u00020\u0002\u001a\n\u0010N\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010\u000b\u001a\u00020\u0002*\u00020O\u001a\u0014\u0010P\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010Q\u001a\u00020\u0002\u001a\n\u0010R\u001a\u00020\u0002*\u00020O\u001a\u0011\u0010S\u001a\u00020\u0002*\u0004\u0018\u00010T¢\u0006\u0002\u0010U\u001a\n\u0010V\u001a\u00020\u0002*\u00020\u0002\u001a\u0012\u0010W\u001a\u00020\u0018*\u00020\u00022\u0006\u0010X\u001a\u00020\u0002\u001a\n\u0010Y\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010Z\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010[\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010\\\u001a\u00020\u0002*\u00020\u0002\u001a\u000e\u0010]\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u0002\u001a\u0012\u0010^\u001a\u00020H*\u00020\u00022\u0006\u0010I\u001a\u00020\u0002\u001a\n\u0010_\u001a\u00020`*\u00020\u0002\"\u001d\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0005\u001a\u00020\u0002X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\b\u001a\u00020\u0002*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0015\u0010\u000b\u001a\u00020\u0002*\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0015\u0010\u000b\u001a\u00020\u0002*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\n\"\u0017\u0010\u000f\u001a\u00020\u0002*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\n\"\u0017\u0010\u0011\u001a\u00020\u0002*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\n\"\u0015\u0010\u0013\u001a\u00020\u0014*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\"\u0015\u0010\u0017\u001a\u00020\u0018*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019\"\u0015\u0010\u001a\u001a\u00020\u0018*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019\"\u0015\u0010\u001b\u001a\u00020\u0018*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019\"\u0015\u0010\u001c\u001a\u00020\u0018*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0019\"\u0015\u0010\u001d\u001a\u00020\u0018*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019\"\u0015\u0010\u001e\u001a\u00020\u0018*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0019\"\u0015\u0010\u001f\u001a\u00020\u0018*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019\"\u0015\u0010 \u001a\u00020\u0018*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010\u0019\"\u0015\u0010!\u001a\u00020\u0018*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b!\u0010\u0019\"\u0015\u0010\"\u001a\u00020\u0002*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010\n\"\u0015\u0010$\u001a\u00020\u0002*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b%\u0010\n\"\u0015\u0010&\u001a\u00020\u0002*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b'\u0010\n\"\u0015\u0010(\u001a\u00020\u0002*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b)\u0010\n¨\u0006a"}, m10421d2 = {"mapOfMonths", "", "", "getMapOfMonths", "()Ljava/util/Map;", "nairaSym", "getNairaSym", "()Ljava/lang/String;", "capitalizeAllWords", "getCapitalizeAllWords", "(Ljava/lang/String;)Ljava/lang/String;", "formatAmount", "", "getFormatAmount", "(I)Ljava/lang/String;", "formatToCurrency", "getFormatToCurrency", "formatToCurrencyWithDecimal", "getFormatToCurrencyWithDecimal", "getSpannedText", "Landroid/text/Spanned;", "getGetSpannedText", "(Ljava/lang/String;)Landroid/text/Spanned;", "isAccountNumber", "", "(Ljava/lang/String;)Z", "isDigit", "isNigerianPhoneNumber", "isNigerianPhoneNumberWithCountryCode", "isNumber", "isValidAmountOfMoney", "isValidBvn", "isValidEmail", "isValidUsername", "loadHtml", "getLoadHtml", "maskEmail", "getMaskEmail", "maskMobile", "getMaskMobile", "removeAllLetters", "getRemoveAllLetters", "convertTimeStampToDate", TransactionField.TIME, "", IjkMediaMeta.IJKM_KEY_FORMAT, "formatKudiDate", "Ljava/util/Date;", AttributeType.DATE, "formatKudiDateAlt", "formatKudiDateAlt2", "formatKudiDateAlt3", "formatKudiDateAlt4", "formatKudiDateAlt5", "getDateDiff", "Ljava/text/SimpleDateFormat;", "oldDate", "newDate", "boldSpan", "Landroid/text/SpannableString;", "startIndex", "endIndex", "spannableString", "clickableSpan", "textColor", "context", "Landroid/content/Context;", "onClicked", "Lkotlin/Function1;", "Landroid/view/View;", "", "colorSpan", "Landroid/text/SpannableStringBuilder;", "slice", "sliceColor", "convertDateFormat", "fromFormat", "toFormat", "discardInitialDigitInPhoneNumber", "", "formatDateWithTime", "splitBy", "formatDecimalAmount", "formatInterest", "", "(Ljava/lang/Double;)Ljava/lang/String;", "formatIsoDate", "isValidIdType", "idtype", "padDigit", "padNigeriaPhoneNumber", "removeCountryCodeFromPhoneNumber", "removeSpaces", "sanitizeFormattedAmount", "superscript", "toEditable", "Landroid/text/Editable;", "core_release"}, k = 2, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class StringExtKt {
    private static final Map<String, String> mapOfMonths;
    private static final String nairaSym = "₦";

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        Map $r2;
        C13287o $r1 = C13664u.m4227a("01", "Jan");
        C13287o $r12 = C13664u.m4227a("02", "Feb");
        C13287o $r13 = C13664u.m4227a("03", "March");
        C13287o $r14 = C13664u.m4227a("04", "April");
        C13287o $r15 = C13664u.m4227a("05", "May");
        C13287o $r16 = C13664u.m4227a("06", "June");
        C13287o $r17 = C13664u.m4227a("07", "July");
        C13287o $r18 = C13664u.m4227a("08", "Aug");
        C13287o $r19 = C13664u.m4227a("09", "Sep");
        C13287o $r110 = C13664u.m4227a("10", "Oct");
        C13287o $r111 = C13664u.m4227a("11", "Nov");
        C13287o $r112 = C13664u.m4227a("12", "Dec");
        C13287o[] $r0 = {$r1, $r12, $r13, $r14, $r15, $r16, $r17, $r18, $r19, $r110, $r111, $r112};
        $r2 = C13727r0.m3878n($r0);
        mapOfMonths = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final SpannableString boldSpan(String str, int i, int i2, SpannableString spannableString) {
        Log_OC.getArray(str, "<this>");
        Log_OC.getArray(spannableString, "spannableString");
        StyleSpan $r2 = new StyleSpan(1);
        spannableString.setSpan($r2, i, i2, 33);
        return spannableString;
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
    public static /* synthetic */ SpannableString boldSpan$default(String str, int $i0, int $i1, SpannableString spannableString, int i, Object obj) {
        int $i3 = i & 1;
        if ($i3 != 0) {
            $i0 = 0;
        }
        int $i2 = i & 2;
        if ($i2 != 0) {
            $i1 = str.length();
        }
        SpannableString $r0 = boldSpan(str, $i0, $i1, spannableString);
        return $r0;
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
    public static final SpannableString clickableSpan(String str, int i, int i2, final int i3, final Context context, SpannableString spannableString, final InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(str, "<this>");
        Log_OC.getArray(context, "context");
        Log_OC.getArray(spannableString, "spannableString");
        Log_OC.getArray(interfaceC11767l, "onClicked");
        spannableString.setSpan(new ClickableSpan() { // from class: ai.kudi.agent.core.util.StringExtKt$clickableSpan$1$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                Log_OC.getArray(view, "view");
                InterfaceC11767l $r2 = InterfaceC11767l.this;
                $r2.invoke(view);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                Log_OC.getArray(textPaint, "ds");
                super.updateDrawState(textPaint);
                Context $r2 = context;
                int $i0 = i3;
                textPaint.setColor(ContextExtKt.getKudiColor($r2, $i0));
                textPaint.setUnderlineText(false);
            }
        }, i, i2, 33);
        StyleSpan $r5 = new StyleSpan(1);
        spannableString.setSpan($r5, i, i2, 33);
        return spannableString;
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
    public static /* synthetic */ SpannableString clickableSpan$default(String str, int $i2, int $i1, int $i3, Context context, SpannableString spannableString, InterfaceC11767l interfaceC11767l, int i, Object obj) {
        int $i4 = i & 1;
        if ($i4 != 0) {
            $i2 = 0;
        }
        int $i42 = i & 2;
        if ($i42 != 0) {
            $i1 = str.length();
        }
        int $i0 = i & 4;
        if ($i0 != 0) {
            $i3 = C0038R.color.black;
        }
        SpannableString $r1 = clickableSpan(str, $i2, $i1, $i3, context, spannableString, interfaceC11767l);
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
    public static final SpannableStringBuilder colorSpan(String str, Context context, String str2, int i) {
        int $i1;
        Log_OC.getArray(str, "<this>");
        Log_OC.getArray(context, "context");
        Log_OC.getArray(str2, "slice");
        SpannableStringBuilder $r3 = new SpannableStringBuilder(str);
        int $i12 = str2.length();
        boolean $z0 = $i12 == 0;
        if (!$z0) {
            int $i13 = str.length();
            int $i2 = str2.length();
            if ($i13 < $i2) {
                return $r3;
            }
            $i1 = C13277t.m5404W(str, str2, 0, false, 6, null);
            int $i22 = str2.length();
            int $i0 = C1335a.m36324d(context, i);
            ForegroundColorSpan $r4 = new ForegroundColorSpan($i0);
            $r3.setSpan($r4, $i1, $i22 + $i1, 33);
        }
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final String convertDateFormat(String str, String str2, String str3) {
        Log_OC.getArray(str, "<this>");
        Log_OC.getArray(str2, "fromFormat");
        Log_OC.getArray(str3, "toFormat");
        try {
            Locale $r4 = Locale.getDefault();
            SimpleDateFormat $r3 = new SimpleDateFormat(str3, $r4);
            SimpleDateFormat $r5 = new SimpleDateFormat(str2);
            Date $r6 = $r5.parse(str);
            String $r1 = $r3.format($r6);
            return $r1.toString();
        } catch (Exception $r7) {
            CrashlyticsReport.logException($r7);
            return "";
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final String convertTimeStampToDate(long j, String str) {
        Log_OC.getArray(str, IjkMediaMeta.IJKM_KEY_FORMAT);
        Locale $r2 = Locale.getDefault();
        SimpleDateFormat $r1 = new SimpleDateFormat(str, $r2);
        Date $r3 = new Date(j);
        String $r0 = $r1.format($r3);
        Log_OC.loadImage($r0, "dateFormat.format(Date(time))");
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
    public static final String discardInitialDigitInPhoneNumber(String str) {
        String $r0;
        Log_OC.getArray(str, "<this>");
        $r0 = C13282v.m5371N0(str, 1);
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
    public static final String formatAmount(Object obj) {
        Log_OC.getArray(obj, "<this>");
        boolean $z0 = Log_OC.append(obj, "unlimited");
        if ($z0) {
            String $r1 = obj.toString();
            return $r1;
        }
        String $r12 = obj.toString();
        boolean $z02 = isNumber($r12);
        if (!$z02) {
            String $r13 = nairaSym;
            return Log_OC.m10359a($r13, obj);
        }
        String $r14 = nairaSym;
        String $r2 = obj.toString();
        return Log_OC.m10359a($r14, (Object) getFormatToCurrency($r2));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final String formatDateWithTime(String $r0, String str) {
        List $r3;
        List $r6;
        boolean $z0;
        List $r32;
        List $r33;
        Log_OC.getArray($r0, "<this>");
        Log_OC.getArray(str, "splitBy");
        try {
            String[] $r2 = {str};
            $r3 = C13277t.m5383r0($r0, $r2, false, 0, 6, null);
            Object $r4 = $r3.get(0);
            CharSequence $r5 = (CharSequence) $r4;
            String[] $r22 = {"-"};
            $r6 = C13277t.m5383r0($r5, $r22, false, 0, 6, null);
            Object $r42 = $r3.get(1);
            String str2 = (String) $r42;
            $z0 = C13277t.m5421J(str2, ".", false, 2, null);
            if ($z0) {
                String[] $r23 = {"."};
                $r33 = C13277t.m5383r0(str2, $r23, false, 0, 6, null);
                Object $r43 = $r33.get(0);
                str2 = (String) $r43;
            }
            String[] $r24 = {":"};
            $r32 = C13277t.m5383r0(str2, $r24, false, 0, 6, null);
            StringBuilder $r7 = new StringBuilder();
            Object $r44 = $r32.get(0);
            String $r1 = (String) $r44;
            $r7.append($r1);
            $r7.append(':');
            Object $r45 = $r32.get(1);
            String $r12 = (String) $r45;
            $r7.append($r12);
            String $r13 = $r7.toString();
            Locale $r9 = Locale.getDefault();
            SimpleDateFormat $r8 = new SimpleDateFormat("H:mm", $r9);
            Locale $r92 = Locale.getDefault();
            SimpleDateFormat $r10 = new SimpleDateFormat(SavingTransactionItem.TIME_FORMAT, $r92);
            Date $r11 = $r8.parse($r13);
            Log_OC.append($r11);
            String $r14 = $r10.format($r11);
            StringBuilder $r72 = new StringBuilder();
            Object $r46 = $r6.get(2);
            String $r122 = (String) $r46;
            $r72.append($r122);
            $r72.append(' ');
            Map $r132 = mapOfMonths;
            Object $r47 = $r6.get(1);
            $r72.append($r132.get($r47));
            $r72.append(", ");
            Object $r48 = $r6.get(0);
            String $r123 = (String) $r48;
            $r72.append($r123);
            $r72.append(" | ");
            $r72.append((Object) $r14);
            return $r72.toString();
        } catch (Throwable $r142) {
            $r142.printStackTrace();
            return $r0;
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
    public static /* synthetic */ String formatDateWithTime$default(String str, String $r2, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $r2 = " ";
        }
        String $r1 = formatDateWithTime(str, $r2);
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
    public static final String formatDecimalAmount(Object obj) {
        Log_OC.getArray(obj, "<this>");
        String $r1 = obj.toString();
        boolean $z0 = isNumber($r1);
        if (!$z0) {
            String $r12 = nairaSym;
            return Log_OC.m10359a($r12, obj);
        }
        String $r13 = nairaSym;
        String $r2 = obj.toString();
        return Log_OC.m10359a($r13, (Object) getFormatToCurrencyWithDecimal($r2));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final String formatInterest(Double d) {
        if (d == null) {
            return "0%";
        }
        C11780a0 c11780a0 = C11780a0.f26475a;
        Object[] $r0 = {d};
        String $r3 = String.format("%.2f", Arrays.copyOf($r0, 1));
        Log_OC.loadImage($r3, "java.lang.String.format(format, *args)");
        return Log_OC.m10359a($r3, (Object) "%");
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
    public static final String formatIsoDate(String str) {
        Log_OC.getArray(str, "<this>");
        Locale $r2 = Locale.getDefault();
        SimpleDateFormat $r1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", $r2);
        Date $r3 = $r1.parse(str);
        Date $r4 = $r3;
        if ($r3 == null) {
            $r4 = new Date();
        }
        Locale $r22 = Locale.getDefault();
        SimpleDateFormat $r12 = new SimpleDateFormat("HH:mm a '|' dd MMM',' yyyy", $r22);
        String $r0 = $r12.format($r4);
        Log_OC.loadImage($r0, "SimpleDateFormat(\"HH:mm a '|' dd MMM',' yyyy\", Locale.getDefault()).format(date)");
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
    public static final Date formatKudiDate(String str) {
        Locale $r2 = Locale.ENGLISH;
        SimpleDateFormat $r0 = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", $r2);
        TimeZone $r3 = TimeZone.getTimeZone("UTC");
        $r0.setTimeZone($r3);
        Date $r4 = $r0.parse(str);
        return $r4 == null ? new Date() : $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final Date formatKudiDateAlt(String str) {
        Log_OC.getArray(str, AttributeType.DATE);
        Locale $r2 = Locale.ENGLISH;
        SimpleDateFormat $r1 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", $r2);
        TimeZone $r3 = TimeZone.getTimeZone("UTC");
        $r1.setTimeZone($r3);
        Date $r4 = $r1.parse(str);
        return $r4 == null ? new Date() : $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final Date formatKudiDateAlt2(String str) {
        Log_OC.getArray(str, AttributeType.DATE);
        Locale $r2 = Locale.getDefault();
        SimpleDateFormat $r1 = new SimpleDateFormat(SavingsAdapter.SERVER_FORMAT, $r2);
        Date $r3 = $r1.parse(str);
        return $r3 == null ? new Date() : $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final Date formatKudiDateAlt3(String str) {
        Log_OC.getArray(str, AttributeType.DATE);
        Locale $r2 = Locale.getDefault();
        SimpleDateFormat $r1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", $r2);
        Date $r3 = $r1.parse(str);
        return $r3 == null ? new Date() : $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final Date formatKudiDateAlt4(String str) {
        Log_OC.getArray(str, AttributeType.DATE);
        try {
            Locale $r3 = Locale.getDefault();
            SimpleDateFormat $r2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", $r3);
            Date $r4 = $r2.parse(str);
            return $r4 == null ? new Date() : $r4;
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final Date formatKudiDateAlt5(String str) {
        Log_OC.getArray(str, AttributeType.DATE);
        Locale $r2 = Locale.getDefault();
        SimpleDateFormat $r1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS+0000", $r2);
        Date $r3 = $r1.parse(str);
        return $r3 == null ? new Date() : $r3;
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
    /* JADX WARN: Incorrect condition in loop: B:4:0x0028 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String getCapitalizeAllWords(java.lang.String r19) {
        /*
            java.lang.String r6 = "<this>"
            r0 = r19
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r6)
            r8 = 1
            java.lang.String[] r7 = new java.lang.String[r8]
            r8 = 0
            java.lang.String r6 = " "
            r7[r8] = r6
            r8 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            r0 = r19
            r1 = r7
            r2 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            java.util.List r9 = kotlin.p549l0.C13265j.m5473r0(r0, r1, r2, r3, r4, r5)
            java.util.Iterator r13 = r9.iterator()
            java.lang.String r19 = ""
        L24:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L5d
            java.lang.Object r15 = r13.next()
            r17 = r15
            java.lang.String r17 = (java.lang.String) r17
            r16 = r17
            java.lang.StringBuilder r18 = new java.lang.StringBuilder
            r0 = r18
            r0.<init>()
            r0 = r18
            r1 = r19
            r0.append(r1)
            r0 = r16
            java.lang.String r19 = kotlin.p549l0.C13265j.m5477o(r0)
            r0 = r18
            r1 = r19
            r0.append(r1)
            r8 = 32
            r0 = r18
            r0.append(r8)
            r0 = r18
            java.lang.String r19 = r0.toString()
            goto L24
        L5d:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.util.StringExtKt.getCapitalizeAllWords(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final long getDateDiff(SimpleDateFormat simpleDateFormat, String str, String str2) {
        Log_OC.getArray(simpleDateFormat, IjkMediaMeta.IJKM_KEY_FORMAT);
        Log_OC.getArray(str, "oldDate");
        Log_OC.getArray(str2, "newDate");
        TimeUnit $r3 = TimeUnit.DAYS;
        try {
            Date $r4 = simpleDateFormat.parse(str2);
            long $l0 = $r4.getTime();
            Date $r42 = simpleDateFormat.parse(str);
            long $l1 = $r42.getTime();
            long $l02 = $l0 - $l1;
            TimeUnit $r5 = TimeUnit.MILLISECONDS;
            return $r3.convert($l02, $r5);
        } catch (Exception $r6) {
            $r6.printStackTrace();
            return 0L;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final String getFormatAmount(int i) {
        Integer $r0 = Integer.valueOf(i);
        String $r1 = formatAmount($r0);
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
    public static final String getFormatAmount(String str) {
        Log_OC.getArray(str, "<this>");
        String $r0 = formatAmount(str);
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
    public static final String getFormatToCurrency(String str) {
        DecimalFormat $r1 = new DecimalFormat("###,###,##0");
        double $d0 = Double.parseDouble(str);
        String $r0 = $r1.format($d0);
        Log_OC.loadImage($r0, "formatter.format(parseDouble(this))");
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
    public static final String getFormatToCurrencyWithDecimal(String str) {
        DecimalFormat $r1 = new DecimalFormat("###,###,##0.00");
        double $d0 = Double.parseDouble(str);
        String $r0 = $r1.format($d0);
        Log_OC.loadImage($r0, "formatter.format(parseDouble(this))");
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
    public static final Spanned getGetSpannedText(String str) {
        Log_OC.getArray(str, "<this>");
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 >= 24) {
            Spanned $r1 = Html.fromHtml(str, 0);
            Log_OC.loadImage($r1, "fromHtml(this, Html.FROM_HTML_MODE_LEGACY)");
            return $r1;
        }
        Spanned $r12 = Html.fromHtml(str);
        Log_OC.loadImage($r12, "fromHtml(this)");
        return $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final String getLoadHtml(String $r0) {
        Log_OC.getArray($r0, "<this>");
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 >= 24) {
            Spanned $r1 = Html.fromHtml($r0, 0);
            return $r1.toString();
        }
        Spanned $r12 = Html.fromHtml($r0);
        return $r12.toString();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final Map getMapOfMonths() {
        Map r0 = mapOfMonths;
        return r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final String getMaskEmail(String str) {
        Log_OC.getArray(str, "<this>");
        C13262h $r1 = new C13262h("(?<=.{2}).(?=[^@]*?@)");
        String $r0 = $r1.m5521f(str, "*");
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
    public static final String getMaskMobile(String str) {
        String $r2;
        String $r22;
        String $r0;
        Log_OC.getArray(str, "<this>");
        StringBuilder $r1 = new StringBuilder();
        $r2 = C13282v.m5369P0(str, 4);
        $r1.append($r2);
        $r22 = C13276s.m5438w("*", 4);
        $r1.append($r22);
        $r0 = C13282v.m5368Q0(str, 3);
        $r1.append($r0);
        String $r02 = $r1.toString();
        return $r02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final String getNairaSym() {
        String r0 = nairaSym;
        return r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final String getRemoveAllLetters(String str) {
        Log_OC.getArray(str, "<this>");
        C13262h $r1 = new C13262h("[^\\d.-]");
        String $r0 = $r1.m5521f(str, "");
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
    public static final boolean isAccountNumber(String str) {
        Log_OC.getArray(str, "<this>");
        int $i0 = str.length();
        if ($i0 == 10) {
            boolean $z0 = isDigit(str);
            return $z0;
        }
        return false;
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
    /* JADX WARN: Incorrect condition in loop: B:11:0x0028 */
    /* JADX WARN: Incorrect condition in loop: B:17:0x0050 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean isDigit(java.lang.String r17) {
        /*
            java.lang.String r1 = "<this>"
            r0 = r17
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            r0 = r17
            int r2 = r0.length()
            if (r2 != 0) goto L11
            r3 = 1
            goto L12
        L11:
            r3 = 0
        L12:
            if (r3 == 0) goto L16
            r4 = 0
            return r4
        L16:
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = r17
            int r2 = r0.length()
            r5.<init>(r2)
            r2 = 0
        L22:
            r0 = r17
            int r6 = r0.length()
            if (r2 >= r6) goto L3e
            r0 = r17
            char r7 = r0.charAt(r2)
            boolean r3 = java.lang.Character.isDigit(r7)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            r5.add(r8)
            int r2 = r2 + 1
            goto L22
        L3e:
            java.util.Iterator r9 = r5.iterator()
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L7b
            java.lang.Object r10 = r9.next()
        L4c:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L72
            java.lang.Object r11 = r9.next()
            r12 = r11
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            r8 = r12
            boolean r3 = r8.booleanValue()
            r13 = r10
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            r8 = r13
            boolean r14 = r8.booleanValue()
            if (r14 == 0) goto L6c
            if (r3 == 0) goto L6c
            r3 = 1
            goto L6d
        L6c:
            r3 = 0
        L6d:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            goto L4c
        L72:
            r15 = r10
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            r8 = r15
            boolean r3 = r8.booleanValue()
            return r3
        L7b:
            java.lang.UnsupportedOperationException r16 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Empty collection can't be reduced."
            r0 = r16
            r0.<init>(r1)
            goto L85
        L85:
            throw r16
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.util.StringExtKt.isDigit(java.lang.String):boolean");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final boolean isNigerianPhoneNumber(String str) {
        boolean $z0;
        Log_OC.getArray(str, "<this>");
        int $i0 = str.length();
        if ($i0 == 11) {
            $z0 = C13276s.m5447E(str, "0", false, 2, null);
            if ($z0) {
                boolean $z02 = isDigit(str);
                return $z02;
            }
            return false;
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
    public static final boolean isNigerianPhoneNumberWithCountryCode(String str) {
        boolean $z0;
        Log_OC.getArray(str, "<this>");
        int $i0 = str.length();
        if ($i0 == 14) {
            $z0 = C13276s.m5447E(str, "+234", false, 2, null);
            if ($z0) {
                String $r0 = str.substring(4);
                Log_OC.loadImage($r0, "(this as java.lang.String).substring(startIndex)");
                boolean $z02 = isDigit($r0);
                return $z02;
            }
            return false;
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
    public static final boolean isNumber(String str) {
        Log_OC.getArray(str, "<this>");
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
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
    public static final boolean isValidAmountOfMoney(String str) {
        boolean $z0;
        Log_OC.getArray(str, "<this>");
        $z0 = C13276s.m5440u(str);
        if (!$z0) {
            double $d0 = Double.parseDouble(str);
            boolean $z02 = $d0 == 0.0d;
            return !$z02;
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
    public static final boolean isValidBvn(String str) {
        Log_OC.getArray(str, "<this>");
        Pattern $r1 = Pattern.compile("^[0-9]{11}$");
        Matcher $r2 = $r1.matcher(str);
        boolean $z0 = $r2.matches();
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final boolean isValidEmail(String str) {
        Log_OC.getArray(str, "<this>");
        Pattern $r1 = Pattern.compile("^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$", 2);
        Matcher $r2 = $r1.matcher(str);
        boolean $z0 = $r2.matches();
        return $z0;
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
    public static final boolean isValidIdType(String str, String $r1) {
        String $r12;
        Log_OC.getArray(str, "<this>");
        Log_OC.getArray($r1, "idtype");
        IdTypes $r2 = IdTypes.NATIONAL_ID_CARD;
        String $r3 = $r2.getLabel();
        boolean $z0 = Log_OC.append($r1, $r3);
        if ($z0) {
            $r12 = "/^[0-9]{11}$";
        } else {
            IdTypes $r22 = IdTypes.DRIVERS_LICENSE;
            String $r32 = $r22.getLabel();
            boolean $z02 = Log_OC.append($r1, $r32);
            if ($z02) {
                $r12 = "/^[A-Z0-9]{3}([ -]{1})?[A-Z0-9]{6,12}$/i";
            } else {
                IdTypes $r23 = IdTypes.NIMC_SLIP;
                String $r33 = $r23.getLabel();
                boolean $z03 = Log_OC.append($r1, $r33);
                if ($z03) {
                    $r12 = "/^[0-9]{11}$/";
                } else {
                    IdTypes $r24 = IdTypes.VOTERS_CARD;
                    String $r34 = $r24.getLabel();
                    boolean $z04 = Log_OC.append($r1, $r34);
                    if ($z04) {
                        $r12 = "/^[A-Z0-9 ]{9,23}$/i";
                    } else {
                        IdTypes $r25 = IdTypes.INTL_PASSPORT;
                        String $r35 = $r25.getLabel();
                        boolean $z05 = Log_OC.append($r1, $r35);
                        $r12 = $z05 ? "/^[A-Z]{1}( )?[0-9]{9}$/i" : "";
                    }
                }
            }
        }
        Pattern $r4 = Pattern.compile($r12);
        Matcher $r5 = $r4.matcher(str);
        boolean $z06 = $r5.matches();
        return $z06;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final boolean isValidUsername(String str) {
        Log_OC.getArray(str, "<this>");
        Pattern $r1 = Pattern.compile("^[A-Za-z][A-Za-z0-9_\\-.]{5,15}$");
        Matcher $r2 = $r1.matcher(str);
        boolean $z0 = $r2.matches();
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final String padDigit(String $r0) {
        Log_OC.getArray($r0, "<this>");
        int $i0 = $r0.length();
        return $i0 == 1 ? Log_OC.m10359a("0", (Object) $r0) : $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final String padNigeriaPhoneNumber(String str) {
        Log_OC.getArray(str, "<this>");
        StringBuilder $r1 = new StringBuilder();
        $r1.append("+234 ");
        String $r2 = str.substring(1, 6);
        Log_OC.loadImage($r2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        $r1.append($r2);
        $r1.append(' ');
        String $r22 = str.substring(6, 9);
        Log_OC.loadImage($r22, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        $r1.append($r22);
        $r1.append(' ');
        int $i0 = str.length();
        String $r0 = str.substring(9, $i0);
        Log_OC.loadImage($r0, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        $r1.append($r0);
        return $r1.toString();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final String removeCountryCodeFromPhoneNumber(String str) {
        String $r0;
        Log_OC.getArray(str, "<this>");
        $r0 = C13276s.m5451A(str, "+234", "0", false, 4, null);
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
    public static final String removeSpaces(String str) {
        Log_OC.getArray(str, "<this>");
        C13262h $r1 = new C13262h("\\s");
        String $r0 = $r1.m5521f(str, "");
        return $r0;
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
    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String sanitizeFormattedAmount(java.lang.String r9) {
        /*
            r0 = 0
            if (r9 == 0) goto Lc
            int r1 = r9.length()
            if (r1 != 0) goto La
            goto Lc
        La:
            r2 = 0
            goto Ld
        Lc:
            r2 = 1
        Ld:
            if (r2 == 0) goto L10
            return r9
        L10:
            if (r9 == 0) goto L38
            char[] r3 = r9.toCharArray()
            java.lang.String r4 = "(this as java.lang.String).toCharArray()"
            kotlin.p483e0.p485d.Log_OC.loadImage(r3, r4)
            int r1 = r3.length
            java.lang.String r9 = ""
        L1e:
            if (r0 >= r1) goto L37
            char r5 = r3[r0]
            boolean r2 = java.lang.Character.isDigit(r5)
            if (r2 != 0) goto L2c
            r6 = 46
            if (r5 != r6) goto L34
        L2c:
            java.lang.Character r7 = java.lang.Character.valueOf(r5)
            java.lang.String r9 = kotlin.p483e0.p485d.Log_OC.m10359a(r9, r7)
        L34:
            int r0 = r0 + 1
            goto L1e
        L37:
            return r9
        L38:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r4 = "null cannot be cast to non-null type java.lang.String"
            r8.<init>(r4)
            goto L40
        L40:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.util.StringExtKt.sanitizeFormattedAmount(java.lang.String):java.lang.String");
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
    public static final SpannableStringBuilder superscript(String str, String str2) {
        int $i0;
        Log_OC.getArray(str, "<this>");
        Log_OC.getArray(str2, "slice");
        SpannableStringBuilder $r2 = new SpannableStringBuilder(str);
        int $i02 = str2.length();
        boolean $z0 = $i02 == 0;
        if (!$z0) {
            int $i03 = str.length();
            int $i1 = str2.length();
            if ($i03 < $i1) {
                return $r2;
            }
            $i0 = C13277t.m5404W(str, str2, 0, false, 6, null);
            int $i12 = str2.length();
            int $i13 = $i12 + $i0;
            SuperscriptSpan $r3 = new SuperscriptSpan();
            $r2.setSpan($r3, $i0, $i13, 33);
            RelativeSizeSpan $r4 = new RelativeSizeSpan(0.75f);
            $r2.setSpan($r4, $i0, $i13, 33);
        }
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final Editable toEditable(String str) {
        Log_OC.getArray(str, "<this>");
        Editable.Factory $r1 = Editable.Factory.getInstance();
        Editable $r2 = $r1.newEditable(str);
        Log_OC.loadImage($r2, "getInstance().newEditable(this)");
        return $r2;
    }
}
