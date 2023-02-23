package ai.kudi.agent.biometric.security;

import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.util.Base64;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.security.auth.x500.X500Principal;
import kotlin.Metadata;
import kotlin.p483e0.p485d.C11811v;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13254d;
/* compiled from: PFSecurityUtilsOld.kt */
@Metadata(m10422d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J(\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J \u0010\u0015\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J \u0010\u001b\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¨\u0006\u001e"}, m10421d2 = {"Lai/kudi/agent/biometric/security/PFSecurityUtilsOld;", "Lai/kudi/agent/biometric/security/IPFSecurityUtils;", "()V", "decode", "", "alias", "encodedString", "deleteKey", "", "encode", "context", "Landroid/content/Context;", MetricTracker.Object.INPUT, "isAuthorizationRequired", "", "generateKey", "keystoreAlias", "isAuthenticationRequired", "generateKeyIfNecessary", "keyStore", "Ljava/security/KeyStore;", "generateKeyOld", "isKeystoreContainAlias", "loadKeyStore", "rsaDecrypt", "", "encrypted", "rsaEncrypt", "secret", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PFSecurityUtilsOld implements IPFSecurityUtils {
    public static final Companion Companion;
    private static final String PROVIDER;
    private static final String RSA_MODE;

    /* compiled from: PFSecurityUtilsOld.kt */
    @Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/biometric/security/PFSecurityUtilsOld$Companion;", "", "()V", "PROVIDER", "", "RSA_MODE", "getInstance", "Lai/kudi/agent/biometric/security/PFSecurityUtilsOld;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final PFSecurityUtilsOld getInstance() {
            PFSecurityUtilsOld $r1 = new PFSecurityUtilsOld(null);
            return $r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
        RSA_MODE = "RSA/ECB/PKCS1Padding";
        int $i0 = Build.VERSION.SDK_INT;
        String $r1 = $i0 >= 23 ? "AndroidKeyStoreBCWorkaround" : "AndroidOpenSSL";
        PROVIDER = $r1;
    }

    private PFSecurityUtilsOld() {
    }

    public /* synthetic */ PFSecurityUtilsOld(DBUtils$1 dBUtils$1) {
        this();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean generateKey(Context context, String str, boolean z) {
        boolean $z0 = generateKeyOld(context, str, z);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean generateKeyIfNecessary(Context context, KeyStore keyStore, String str, boolean z) {
        try {
            boolean $z1 = keyStore.containsAlias(str);
            if ($z1) {
                return true;
            }
            boolean $z0 = generateKey(context, str, z);
            return $z0;
        } catch (KeyStoreException $r4) {
            $r4.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean generateKeyOld(Context context, String str, boolean z) {
        try {
            Calendar $r3 = Calendar.getInstance();
            Calendar $r4 = Calendar.getInstance();
            $r4.add(1, 25);
            KeyPairGenerator $r5 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            KeyPairGeneratorSpec.Builder $r6 = new KeyPairGeneratorSpec.Builder(context);
            KeyPairGeneratorSpec.Builder $r62 = $r6.setAlias(str);
            String $r8 = Log_OC.m10359a("CN=", (Object) str);
            X500Principal $r7 = new X500Principal($r8);
            KeyPairGeneratorSpec.Builder $r63 = $r62.setSubject($r7);
            int $i0 = str.hashCode();
            long $l1 = Math.abs($i0);
            BigInteger $r9 = BigInteger.valueOf($l1);
            KeyPairGeneratorSpec.Builder $r64 = $r63.setSerialNumber($r9);
            Date $r10 = $r4.getTime();
            KeyPairGeneratorSpec.Builder $r65 = $r64.setEndDate($r10);
            Date $r102 = $r3.getTime();
            KeyPairGeneratorSpec.Builder $r66 = $r65.setStartDate($r102);
            BigInteger $r92 = BigInteger.ONE;
            KeyPairGeneratorSpec.Builder $r67 = $r66.setSerialNumber($r92);
            X500Principal $r72 = new X500Principal("CN = Secured Preference Store, O = Devliving Online");
            KeyPairGeneratorSpec $r11 = $r67.setSubject($r72).build();
            Log_OC.loadImage($r11, "Builder(context)\n                    .setAlias(keystoreAlias)\n                    .setSubject(X500Principal(\"CN=$keystoreAlias\"))\n                    .setSerialNumber(\n                            BigInteger.valueOf(Math.abs(keystoreAlias.hashCode()).toLong()))\n                    .setEndDate(end.time)\n                    .setStartDate(start.time)\n                    .setSerialNumber(BigInteger.ONE)\n                    .setSubject(X500Principal(\n                            \"CN = Secured Preference Store, O = Devliving Online\")\n                    )\n                    .build()");
            $r5.initialize($r11);
            $r5.generateKeyPair();
            return true;
        } catch (InvalidAlgorithmParameterException $r12) {
            $r12.printStackTrace();
            return false;
        } catch (NoSuchAlgorithmException $r14) {
            $r14.printStackTrace();
            return false;
        } catch (NoSuchProviderException $r13) {
            $r13.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final KeyStore loadKeyStore() throws PFSecurityException {
        try {
            KeyStore $r1 = KeyStore.getInstance("AndroidKeyStore");
            $r1.load(null);
            Log_OC.loadImage($r1, "keyStore");
            return $r1;
        } catch (IOException $r2) {
            $r2.printStackTrace();
            String $r4 = $r2.getMessage();
            String $r42 = Log_OC.m10359a("Can not load keystore:", (Object) $r4);
            PFSecurityUtilsErrorCodes $r5 = PFSecurityUtilsErrorCodes.INSTANCE;
            int $i0 = $r5.getERROR_LOAD_KEY_STORE();
            Integer $r6 = Integer.valueOf($i0);
            PFSecurityException $r3 = new PFSecurityException($r42, $r6);
            throw $r3;
        } catch (KeyStoreException $r9) {
            $r9.printStackTrace();
            String $r43 = $r9.getMessage();
            String $r44 = Log_OC.m10359a("Can not load keystore:", (Object) $r43);
            PFSecurityUtilsErrorCodes $r52 = PFSecurityUtilsErrorCodes.INSTANCE;
            int $i02 = $r52.getERROR_LOAD_KEY_STORE();
            Integer $r62 = Integer.valueOf($i02);
            PFSecurityException $r32 = new PFSecurityException($r44, $r62);
            throw $r32;
        } catch (NoSuchAlgorithmException $r8) {
            $r8.printStackTrace();
            String $r45 = $r8.getMessage();
            String $r46 = Log_OC.m10359a("Can not load keystore:", (Object) $r45);
            PFSecurityUtilsErrorCodes $r53 = PFSecurityUtilsErrorCodes.INSTANCE;
            int $i03 = $r53.getERROR_LOAD_KEY_STORE();
            Integer $r63 = Integer.valueOf($i03);
            PFSecurityException $r33 = new PFSecurityException($r46, $r63);
            throw $r33;
        } catch (CertificateException $r7) {
            $r7.printStackTrace();
            String $r47 = $r7.getMessage();
            String $r48 = Log_OC.m10359a("Can not load keystore:", (Object) $r47);
            PFSecurityUtilsErrorCodes $r54 = PFSecurityUtilsErrorCodes.INSTANCE;
            int $i04 = $r54.getERROR_LOAD_KEY_STORE();
            Integer $r64 = Integer.valueOf($i04);
            PFSecurityException $r34 = new PFSecurityException($r48, $r64);
            throw $r34;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final byte[] rsaDecrypt(byte[] bArr, String str) throws Exception {
        KeyStore $r3 = loadKeyStore();
        KeyStore.Entry $r4 = $r3.getEntry(str, null);
        if ($r4 == null) {
            NullPointerException $r17 = new NullPointerException("null cannot be cast to non-null type java.security.KeyStore.PrivateKeyEntry");
            throw $r17;
        }
        KeyStore.PrivateKeyEntry $r5 = (KeyStore.PrivateKeyEntry) $r4;
        String $r2 = RSA_MODE;
        String $r6 = PROVIDER;
        Cipher $r7 = Cipher.getInstance($r2, $r6);
        PrivateKey $r8 = $r5.getPrivateKey();
        $r7.init(2, $r8);
        ByteArrayInputStream $r10 = new ByteArrayInputStream(bArr);
        CipherInputStream $r9 = new CipherInputStream($r10, $r7);
        ArrayList $r11 = new ArrayList();
        C11811v $r12 = new C11811v();
        $r12.f26498c = -1;
        while (true) {
            PFSecurityUtilsOld$rsaDecrypt$1 $r13 = new PFSecurityUtilsOld$rsaDecrypt$1($r12, $r9);
            Number $r15 = (Number) $r13.invoke();
            int $i0 = $r15.intValue();
            if ($i0 == -1) {
                break;
            }
            int $i02 = $r12.f26498c;
            byte $b1 = (byte) $i02;
            Byte $r16 = Byte.valueOf($b1);
            $r11.add($r16);
        }
        int $i2 = $r11.size();
        byte[] $r1 = new byte[$i2];
        int $i03 = 0;
        int $i22 = $i2 - 1;
        if ($i22 < 0) {
            return $r1;
        }
        while (true) {
            int $i3 = $i03 + 1;
            Object $r14 = $r11.get($i03);
            Log_OC.loadImage($r14, "values[i]");
            Number $r152 = (Number) $r14;
            byte $b12 = $r152.byteValue();
            $r1[$i03] = $b12;
            if ($i3 > $i22) {
                return $r1;
            }
            $i03 = $i3;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final byte[] rsaEncrypt(Context context, byte[] bArr, String str) throws Exception {
        KeyStore $r4 = loadKeyStore();
        generateKeyIfNecessary(context, $r4, str, false);
        KeyStore.Entry $r5 = $r4.getEntry(str, null);
        if ($r5 == null) {
            NullPointerException $r13 = new NullPointerException("null cannot be cast to non-null type java.security.KeyStore.PrivateKeyEntry");
            throw $r13;
        }
        KeyStore.PrivateKeyEntry $r6 = (KeyStore.PrivateKeyEntry) $r5;
        String $r3 = RSA_MODE;
        String $r7 = PROVIDER;
        Cipher $r8 = Cipher.getInstance($r3, $r7);
        Certificate $r9 = $r6.getCertificate();
        PublicKey $r10 = $r9.getPublicKey();
        $r8.init(1, $r10);
        ByteArrayOutputStream $r11 = new ByteArrayOutputStream();
        CipherOutputStream $r12 = new CipherOutputStream($r11, $r8);
        $r12.write(bArr);
        $r12.close();
        byte[] $r2 = $r11.toByteArray();
        Log_OC.loadImage($r2, "outputStream.toByteArray()");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.biometric.security.IPFSecurityUtils
    public String decode(String str, String str2) throws PFSecurityException {
        Log_OC.getArray(str, "alias");
        Log_OC.getArray(str2, "encodedString");
        try {
            byte[] $r3 = Base64.decode(str2, 2);
            Log_OC.loadImage($r3, "bytes");
            byte[] $r32 = rsaDecrypt($r3, str);
            Charset $r4 = C13254d.f29413a;
            String $r1 = new String($r32, $r4);
            return $r1;
        } catch (Exception $r5) {
            $r5.printStackTrace();
            String $r12 = $r5.getMessage();
            String $r13 = Log_OC.m10359a("Error while decoding: ", (Object) $r12);
            PFSecurityUtilsErrorCodes $r7 = PFSecurityUtilsErrorCodes.INSTANCE;
            int $i0 = $r7.getERROR_DEENCODING();
            Integer $r8 = Integer.valueOf($i0);
            PFSecurityException $r6 = new PFSecurityException($r13, $r8);
            throw $r6;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.biometric.security.IPFSecurityUtils
    public void deleteKey(String str) throws PFSecurityException {
        Log_OC.getArray(str, "alias");
        KeyStore $r2 = loadKeyStore();
        try {
            $r2.deleteEntry(str);
        } catch (KeyStoreException $r3) {
            $r3.printStackTrace();
            String $r1 = $r3.getMessage();
            String $r12 = Log_OC.m10359a("Can not delete key: ", (Object) $r1);
            PFSecurityUtilsErrorCodes $r5 = PFSecurityUtilsErrorCodes.INSTANCE;
            int $i0 = $r5.getERROR_DELETE_KEY();
            Integer $r6 = Integer.valueOf($i0);
            PFSecurityException $r4 = new PFSecurityException($r12, $r6);
            throw $r4;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.biometric.security.IPFSecurityUtils
    public String encode(Context context, String str, String str2, boolean z) throws PFSecurityException {
        Log_OC.getArray(context, "context");
        Log_OC.getArray(str, "alias");
        Log_OC.getArray(str2, MetricTracker.Object.INPUT);
        Charset $r4 = C13254d.f29413a;
        try {
            byte[] $r5 = str2.getBytes($r4);
            Log_OC.loadImage($r5, "(this as java.lang.String).getBytes(charset)");
            String $r2 = Base64.encodeToString(rsaEncrypt(context, $r5, str), 2);
            Log_OC.loadImage($r2, "encodeToString(bytes, Base64.NO_WRAP)");
            return $r2;
        } catch (Exception $r6) {
            $r6.printStackTrace();
            String $r22 = $r6.getMessage();
            String $r23 = Log_OC.m10359a("Error while encoding : ", (Object) $r22);
            PFSecurityUtilsErrorCodes $r8 = PFSecurityUtilsErrorCodes.INSTANCE;
            int $i0 = $r8.getERROR_ENCODING();
            Integer $r9 = Integer.valueOf($i0);
            PFSecurityException $r7 = new PFSecurityException($r23, $r9);
            throw $r7;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.biometric.security.IPFSecurityUtils
    public boolean isKeystoreContainAlias(String str) throws PFSecurityException {
        Log_OC.getArray(str, "alias");
        KeyStore $r2 = loadKeyStore();
        try {
            boolean $z0 = $r2.containsAlias(str);
            return $z0;
        } catch (KeyStoreException $r3) {
            $r3.printStackTrace();
            String $r1 = $r3.getMessage();
            PFSecurityUtilsErrorCodes $r5 = PFSecurityUtilsErrorCodes.INSTANCE;
            int $i0 = $r5.getERROR_KEY_STORE();
            Integer $r6 = Integer.valueOf($i0);
            PFSecurityException $r4 = new PFSecurityException($r1, $r6);
            throw $r4;
        }
    }
}
