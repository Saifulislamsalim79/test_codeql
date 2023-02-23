package io.intercom.android.sdk.blocks.function;

import io.intercom.android.sdk.models.Part;
import java.util.Calendar;
/* loaded from: classes.dex */
public class TimestampAdder {
    private final Calendar currentDate;
    private final Calendar nextDate;

    TimestampAdder(Calendar calendar, Calendar calendar2) {
        this.currentDate = calendar;
        this.nextDate = calendar2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TimestampAdder create() {
        Calendar $r1 = Calendar.getInstance();
        Calendar $r2 = Calendar.getInstance();
        TimestampAdder $r0 = new TimestampAdder($r1, $r2);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private boolean isDivider(Part part) {
        String $r3 = part.getMessageStyle();
        boolean $z0 = Part.DAY_DIVIDER_STYLE.equals($r3);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
        if (r10 == false) goto L11;
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0019 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void addDayDividers(java.util.List r21) {
        /*
            r20 = this;
            r0 = r20
            java.util.Calendar r2 = r0.currentDate
            r3 = 0
            r2.setTimeInMillis(r3)
            r0 = r20
            java.util.Calendar r2 = r0.nextDate
            r3 = 0
            r2.setTimeInMillis(r3)
            r5 = 0
        L13:
            r0 = r21
            int r6 = r0.size()
            if (r5 >= r6) goto La1
            r0 = r21
            java.lang.Object r7 = r0.get(r5)
            r9 = r7
            io.intercom.android.sdk.models.Part r9 = (io.intercom.android.sdk.models.Part) r9
            r8 = r9
            r0 = r20
            boolean r10 = r0.isDivider(r8)
            if (r10 == 0) goto L2e
            goto L9c
        L2e:
            r0 = r21
            java.lang.Object r7 = r0.get(r5)
            r11 = r7
            io.intercom.android.sdk.models.Part r11 = (io.intercom.android.sdk.models.Part) r11
            r8 = r11
            long r12 = r8.getCreatedAt()
            r0 = r20
            java.util.Calendar r2 = r0.nextDate
            r3 = 1000(0x3e8, double:4.94E-321)
            long r14 = r3 * r12
            r2.setTimeInMillis(r14)
            r0 = r20
            boolean r10 = r0.datesAreFromDifferentDays()
            if (r10 == 0) goto L8b
            if (r5 == 0) goto L67
            int r6 = r5 + (-1)
            r0 = r21
            java.lang.Object r7 = r0.get(r6)
            r16 = r7
            io.intercom.android.sdk.models.Part r16 = (io.intercom.android.sdk.models.Part) r16
            r8 = r16
            r0 = r20
            boolean r10 = r0.isDivider(r8)
            if (r10 != 0) goto L8b
        L67:
            io.intercom.android.sdk.models.Part$Builder r17 = new io.intercom.android.sdk.models.Part$Builder
            r0 = r17
            r0.<init>()
            java.lang.String r18 = "day_divider_style"
            r0 = r17
            r1 = r18
            io.intercom.android.sdk.models.Part$Builder r17 = r0.withStyle(r1)
            r0 = r17
            io.intercom.android.sdk.models.Part$Builder r17 = r0.withCreatedAt(r12)
            r0 = r17
            io.intercom.android.sdk.models.Part r8 = r0.build()
            r0 = r21
            r0.add(r5, r8)
            int r5 = r5 + 1
        L8b:
            r0 = r20
            java.util.Calendar r2 = r0.currentDate
            r0 = r20
            java.util.Calendar r0 = r0.nextDate
            r19 = r0
            long r12 = r0.getTimeInMillis()
            r2.setTimeInMillis(r12)
        L9c:
            int r5 = r5 + 1
            goto L13
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.blocks.function.TimestampAdder.addDayDividers(java.util.List):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    boolean datesAreFromDifferentDays() {
        Calendar $r1 = this.currentDate;
        int $i0 = $r1.get(6);
        Calendar $r12 = this.nextDate;
        int $i1 = $r12.get(6);
        if ($i0 == $i1) {
            Calendar $r13 = this.currentDate;
            int $i02 = $r13.get(1);
            Calendar $r14 = this.nextDate;
            int $i12 = $r14.get(1);
            return $i02 != $i12;
        }
        return true;
    }
}
