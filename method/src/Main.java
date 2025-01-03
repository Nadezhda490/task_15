public class Main {

//    public static int[] concat(int[] one , int[] two){
//        return null;
//    }

//Есть 2 массива
//    int[] arr1 = {-2,-1,0,4,7,10,12};
//    int[] arr2 = {-10,1,1,1,2,3,6,7,10,100,1000};
//Написать метод который принимает 2 массива и возвращает
//3тий массив в таком виде чтобы данный массив был выстроен от
// меньшего до большего
//    int[] arr3 = concat(arr1,arr2);
//    for (int i = 0; i < arr3.length; i++) {
//        System.out.print(arr3[i] + " ");
//    }
//-10,-2,-1,1,1,1,0,2,3,4,6,7,7,10,10,12,100,1000
//Нельзя использовать
//Какие либо готовые методы
//Сортировку

    public static int[] concat(int[] one, int[] two) {
        int[] three = new int[one.length + two.length];
        int a = 0;
        int b = 0;
        for (int i = 0; i < three.length; i++) {
            if (a < one.length) {
                if (b >= two.length || one[a] < two[b]) {
                    three[i] = one[a];
                    a++;
                } else {
                    three[i] = two[b];
                    b++;
                }
            } else {
                three[i] = two[b];
                b++;
            }
        }
        return three;
    }

    public static void main(String[] args) {
        int[] arr1 = {-2, -1, 0, 4, 7, 10, 12};
        int[] arr2 = {-10, 1, 1, 1, 2, 3, 6, 7, 10, 100, 1000};
        int[] arr3 = concat(arr1, arr2);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}