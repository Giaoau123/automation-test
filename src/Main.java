public class Main {
    public static void main(String[] args) {

        int[] mang = {1, 2, 3, 4, 5};

        int tongSoLe = 0;
        int tongSoChan = 0;

        for (int i = 0; i < mang.length; i++) {

          if (mang[i] % 2 == 0) { // % la chia lay phan du
              tongSoChan = tongSoChan + 1;
          } else {
              tongSoLe = tongSoLe + 1;
          }



        }

        int i = 0;
        while (i < mang.length) {
            if (mang[i] % 2 == 0) { // % la chia lay phan du
                tongSoChan = tongSoChan + 1;
            } else {
                tongSoLe = tongSoLe + 1;
            }

            i++;
        }

        System.out.println("Tong so chan la: " +tongSoChan);
        System.out.println("Tong so le la: " +tongSoLe);
    }
}