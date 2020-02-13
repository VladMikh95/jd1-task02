package by.htp.decomposition.main;

public class One {

	public static void main(String[] args) {
		run1();
		run2();
		run3();
		run4();
		run5();
		run6();
		run7();
		run8();
		run9();
		run10();
		run11();
		run12();
		run13();
		run14();
		run15();
		run16();
		run17();
		run18();
		run19();
		run20();		
	}
	
	/*
	 * Задача 1.  Треугольник задан координатами своих вершин. Написать метод для
	 * вычисления его площади
	 */
	public static void run1() {
		int x1;
		int x2;
		int x3;
		int y1;
		int y2;
		int y3;
		
		double squ;
		
		x1 = 4;
		x2 = 3;
		x3 = 7;
		y1 = 1;
		y2 = 3;
		y3 = 5;
		
		System.out.println("Задача 1");
		squ = Math.abs( (x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) / 2;
		System.out.println("Если х1 = " + x1 + ", x2 = " + x2 + ", x3 = " + x3
							+ ", y1 = " + y1  + ", y2 = " + y2 + ", y3 = " + y3
							+ ", то  площадь равна " 
							+ squ);
		System.out.println("");
	}
	
	/*
	 * Задача 2.  Написать метод(методы) для нахождения наибольшего общего делителя
	 * и наименьшего общего кратного двух натуральных чисел
	 */
	public static void run2() {
		int a;
		int b;
		
		a = 12;
		b = 15;
		
		System.out.println("Задача 2");
		System.out.println("Даны числа " + a + ", " + b);
		if ((nok(a , b) == - 1) || (nod(a, b) == - 1)) {
			System.out.println("Числа a и b должны быть натуральными");
		} else {
			System.out.println("НОД этих чисел равен " + nod(a, b));
			System.out.println("НОК этих чисел равен " + nok(a, b));
		}
		System.out.println("");
	}
	
	/*
	 * Метод используется в 2, 3, 4 задачах. Возвращает НОД указанных чисел
	 */
	public static int nod(int a, int b) {	
		int max;
		int min;
		boolean bool;
		
		if ((a <= 0) || (b <= 0)) {
			return -1;
		}
		
		max = Math.max(a, b);
		min = Math.min(a, b);
		bool = false;
		
		while (!bool) {
			if (max % min == 0) {
				bool = true;
			} else {
				int i = max;
				max = min;
				min = i % min;
			}
		}
		return min;
	}
	
	/*
	 * Используется в задачах 1, 9. Возвращает НОК указанных чисел
	 */
	public static int nok(int a, int b) {
		if ((a <= 0) || (b <= 0)) {
			return -1;
		}
		return a * b / nod(a, b);
	}
	
	/*
	 * Задача 3. Написать метод(методы) для нахождения наибольшего общего делителя
	 * четырех натуральных чисел
	 */
	public static void run3() {
		int a;
		int b;
		int c;
		int d;
		
		int result;
		
		a = 12;
		b = 24;
		c = 18;
		d = 36;
		
		result = nod(a, nod(b, nod(c, d))); // метод nod(int a, int b) написан 
											// во 2 задаче (стр. 83)
		
		
		System.out.println("Задача 3");
		if (result == -1) {
			System.out.println("Все четыре числа должны быть натуральными");
		} else {
			System.out.println("Даны 4 числа " + a + ", " + b + ", " + c + ", " + d);
			System.out.println("НОД этих чисел равен: " + result);
		}
		System.out.println("");
	}
	
	/*
	 * Задача 4.  Написать метод(методы) для нахождения наименьшего общего кратного
	 * трех натуральных чисел
	 */
	public static void run4() {
		int a;
		int b;
		int c;
		int result;
		
		a = 12;
		b = 6;
		c = 18;
		
		result = a * b / nod(a, b);				// метод nod написан во 2 задаче(стр. 83)
		result = result * c / nod(result, c);
		
		System.out.println("Задача 3");
		if ((a < 1) || (b < 1) || (c < 1)) {
			System.out.println("Все три числа должны быть натуральными");
		} else {
			System.out.println("Даны 3 числа " + a + ", " + b + ", " + c);
			System.out.println("НОК этих чисел равен: " + result);
		}
		System.out.println("");
	}
	
	/*
	 * Задача 5. Написать метод(методы) для нахождения суммы большего и меньшего 
	 * из трех чисел
	 */
	public static void run5() {
		int a;
		int b;
		int c;
		
		int result;
		
		a = 13;
		b = 24;
		c = 5;
		
		result = max(a, b, c) + min(a, b, c);
		
		System.out.println("Задача 5");
		System.out.println("Даны 3 числа " + a + ", " + b + ", " + c);
		System.out.println("Результат равен: " + result);
		System.out.println("");
	}
	
	/*
	 * Возвращает max число из трех укзанных чисел
	 */
	public static int max(int a, int b, int c) {
		return Math.max(a, Math.max(b, c));
	}
	
	/*
	 * Возвращает min число из трех укзанных чисел
	 */
	public static int min(int a, int b, int c) {
		return Math.min(a,  Math.min(b, c));
	}
	
	/*
	 * Задача 6. Вычислить площадь правильного шестиугольника со стороной а,
	 * используя метод вычисления площади треугольника
	 */
	public static void run6() {
		int a;
		
		double square;
		
		a = 4;
		
		square = 6 * squareT(a);
		
		System.out.println("Задача 6");
		if (squareT(a) < - 1) {
			System.out.println("a должна быть больше 0");
		} else {
			System.out.println("Сторона шестиугольника равна: " + a);
			System.out.println("Площадь равна: " + square);
		}
		System.out.println("");
	}
	
	/*
	 * Метод возвращает площадь равностороннего треугольника с указанной стороной
	 */
	public static double squareT(int a) {
		if (a < 1) {
			return -1;
		}
		return Math.sqrt(3) * a / 4;
	}
	
	/*
	 * Задача 7. На плоскости заданы своими координатами n точек. 
	 * Написать метод(методы), определяющие, между какими из пар точек самое большое
	 * расстояние. Указание. Координаты точек занести в массив
	 */
	public static void run7() {
		int[][] x;
		
		int[] result;
		
		x = new int[][] {{0, 18}, {0, 4}, {0, 1}, {0, 24}};
		
		result = detPoint(x);
		
		System.out.println("Задача 7");
		if (result == null) {
			System.out.println("Отсутствует массив с координатами точек");
		} else {
			System.out.println("Наибольшее расстояние между точками:");
			System.out.println(result[0] + "[" + result[1] + ", " + result[2] + "], " 
					+ result[3] + "[" + result[4] + ", " + result[2] + "]");
			System.out.println("");
		}
	}
	
	/*
	 * Метод возвращает из указанных точек точки между которыми max расстояние
	 */
	public static int[] detPoint(int[][] a) {
		double max;
		int[] mas;
		
		if (a == null) {
			return null;
		}
		
		max = 0.0;
		mas = new int[] {1, a[0][0], a[0][1], 2, a[1][0], a[1][1]};
		
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				double newM = line(a[i][0], a[i][1], a[j][0], a[j][1]);
				if (max < newM) {
					max = newM;
					mas[0] = i + 1;
					mas[1] = a[i][0];
					mas[2] = a[i][1];
					mas[3] = j + 1;
					mas[4] = a[j][0];
					mas[5] = a[j][1];
				}
			}
		}
		return mas;
	}
	
	/*
	 * Метод возвращает расстояние между указанными точками
	 */
	public static double line(int x1, int y1, int x2, int y2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}
	
	/*
	 * Задача 8.  Составить программу, которая в массиве A[N] находит второе 
	 * по величине число (вывести на печать число, которое меньше максимального 
	 * элемента массива, но больше всех других элементов)
	 */
	public static void run8() {
		int[] a; 
		
		a = new int[] {1, 3, 5, 8, 7, 9, 6};
		
		System.out.println("Задача 8");		
		System.out.println("Дан массив: ");
		for( int i = 0; i < a.length - 1; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println(a[a.length-1]);
		System.out.print("Второе по величине число равно: ");
		System.out.println(run8a(a));
		System.out.println("");
	}
	
	/*
	 * Метод возвращает второе по величине число в указанном массиве
	 */
	public static int run8a(int[] x) {		
		int max = 0;
		int result = 0;
		
		if (x == null) {
			System.out.println("В метод передан null");
			return -1;
		}
		
		for (int i = 0; i < x.length; i++) {
			if(x[i] > max) {
				result = max;
				max = x[i];
			}
		}
		return result;
	}
	
	/*
	 * Задача 9.  Написать метод(методы), проверяющий, являются ли данные три
	 *  числа взаимно простыми
	 */
	public static void run9() {
		int a;
		int b;
		int c;
		
		a = 14;
		b = 15;
		c = 17;
		
		System.out.println("Задача 9");
		System.out.println("Даны три числа " + a + ", " + b  + ", " + c);
		System.out.println("Являются ли данные три числа взаимно простыми: ");
		System.out.println(isSimple(a, b, c));
		System.out.println("");
	}
	
	/*
	 * Возвращает булево значение определяющее являются ли указанные три 
	 * числа взаимно простыми
	 */
	public static boolean isSimple(int a, int b, int c) {
		if ((a < 1) || (b < 1) || (c < 1) ) {
			System.out.println("Простые числа меньше 1 быть не могут");
			return false;
		}
		
		if (nok(a, nok(b, c)) == a * b * c) {		// метод nok написан во 2 задаче
													// стр. 106
			return true;
		} else {
			return false;
		}
	}
	
	/*
	 * Задача 10.  Написать метод(методы) для вычисления суммы факториалов всех
	 * нечетных чисел от 1 до 9
	 */
	public static void run10() {
		int sum = 0;
		for (int i = 1; i <= 9; i = i + 2) {
			sum = sum + factorial(i);
		}
		
		System.out.println("Задача 10");
		System.out.println("Сумма факториалов нечетных чисел от 1 до 9 равна: ");
		System.out.println(sum);
		System.out.println("");
	}

	/*
	 * Метод возвращает факториал указанного числа
	 */
	public static int factorial(int a) {
		int result = a;
		
		if (a < 0) {
			return -1;
		}
		
		for (int i = a - 1; i > 0; i--) {
			result = result * i;
		}
		return result;
	}
	
	/*
	 * Задача 11.  Задан массив D. Определить следующие суммы: 
	 * D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6]. 
	 * Пояснение. Составить метод(методы) для вычисления суммы трех последовательно
	 * расположенных элементов массива с номерами от k до m
	 */
	public static void run11() {
		int[] d;
		
		int sum1;
		int sum2;
		int sum3;
		
		d = new int[] {0, 4, 3, 6, 7, 3};
		
		sum1 = sumForMas(1, 3, d);
		sum2 = sumForMas(3, 5, d);
		sum3 = sumForMas(4, 6, d);
		
		System.out.println("Задача 11");
		System.out.println("Задан массив D");
		System.out.println("Сумма D[l] + D[2] + D[3] равна " + sum1);
		System.out.println("Сумма D[3] + D[4] + D[5] равна " + sum2);
		System.out.println("Сумма D[4] + D[5] + D[6] равна " + sum3);
		System.out.println("");
	}
	
	/*
	 * Метод возвдащает сумму элементов массива в указанном диапозоне
	 */
	public static int sumForMas(int k, int m, int[] a) {
		int sum = 0;
		
		if (a == null) {
			System.out.println("В метод не передан массив значений");
		}
		
		if (a.length <= m) {
			System.out.println("В массиве меньше " + m + " элементов");
			return 0;
		}
		
		if ((m - k != 2) || (k < 0)) {
			System.out.println("Вы указали неправильные номера элементов массива");
			return 0;
		}
		
		for (int i = k; i <= k + 2; i++) {
			sum = sum + a[i];
		}
		return sum;
	}
	
	/*
	 * Задача 12. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать
	 * метод(методы) вычисления его площади, если угол между сторонами длиной 
	 * X и Y— прямой
	 */
	public static void run12() {
		double x;
		double y;
		double z;
		double t;
		
		double square;
		
		x = 2.0;
		y = 4.0;
		z = 2.0;
		t = 4.0;
		
		System.out.println("Задача 12");
		System.out.println("Площадь четырехугольника равна:");
		if ((calcRightTr(x, y) == - 1.0) ||  (calcHyp(x, y) == - 1.0)
				|| (calcHalfPerTr(z, t, calcHyp(x, y)) == - 1.0)
				|| (calcTrHeron(z, t, calcHyp(x, y), calcHalfPerTr(z, t, calcHyp(x, y))) == - 1.0)) {
			System.out.println("Стороны четырехугольника должны быть положительными");
		} else {
			square = calcRightTr(x, y) 
					+ calcTrHeron(z, t, calcHyp(x, y), calcHalfPerTr(z, t, calcHyp(x, y)));
			
			System.out.println(square);
		}
		System.out.println("");
	}
	
	/*
	 * Метод возвращает площадь прямоугольного треугольника с указанными катетами
	 */
	public static double calcRightTr(double a, double b) {
		if ((a <= 0) || (b <= 0)) {
			return -1.0;
		} 
		return a * b / 2;
	}
	
	/*
	 * Метод возвращает длину гипотенузы по указанным катетам
	 */
	public static double calcHyp(double a, double b) {
		if ((a <= 0) || (b <= 0)) {
			return -1.0;
		}
		return Math.sqrt(a * a + b * b);
	}
	
	/*
	 * Метод возвращает полупериметр треугольника по указанным сторонам
	 */
	public static double calcHalfPerTr(double a, double b, double c) {
		if ((a <= 0) || (b <= 0) || (c <= 0)) {
			return -1.0;
		}
		return (a + b + c) / 2;
	}
	
	/*
	 * Возвращает площадь треугольника по формуле Герона с указанными сторонами
	 * и полупериметром
	 */
	public static double calcTrHeron(double a, double b, double c, double hp) {
		if ((a <= 0) || (b <= 0) || (c <= 0) || (hp <= 0)) {
			return -1.0;
		}
		return Math.sqrt(hp * (hp - a) * (hp -b) * (hp - c));
	}
	
	
	/*
	 * Задача 13. Дано натуральное число N. Написать метод(методы) для формирования
	 * массива, элементами которого являются цифры числа N
	 */
	public static void run13() {
		int n;
		
		int[] mas;
		
		n = 1234;
		mas = createArr(n);
				
		System.out.println("Задача 13");
		System.out.println("Число N = " + n + " находится в массиве:");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println("");	
		System.out.println("");
	}
	
	/*
	 * Метод возвращает массив, элементами которого являются цифры указанного числа
	 */
	public static int[] createArr(int n) {
		int[] mas;
		int j; 
		
		n = Math.abs(n);
		mas = new int[countDigit(n)];
		
		for (int i = mas.length - 1; i >= 0; i--) {
				j = n % 10;
				mas[i] = j;
				n = n / 10;
		}
		return mas;
		
		
	}
	/*
	 * Метод используется в задачах 13, 14, 17 возвращает количество цифр 
	 * в указанном числе
	 */
	public static int countDigit(int n) {
		int count = 0;
		
		n = Math.abs(n);
		
		while (n > 0) {
			count++;
			n = n / 10;
		}
		return count;
	}
	
	/*
	 * Задача 14. Написать метод(методы), определяющий, в каком из данных двух
	 * чисел больше цифр
	 */
	public static void run14() {
		int a;
		int b;
		
		String max = "";
		
		a = 12345;
		b = 678;
		
		if (countDigit(a) > countDigit(b) ) { 		// метод countDigit() написан 
													//в 14 задаче
			max = "a";
		} else if (countDigit(a) < countDigit(b) ) {
			max = "b";
		} else {
			max = "Количество цифр в  двух числах равно";
		}
		
		System.out.println("Задача 14");
		System.out.println("В двух числах " + a + ", " + b 
				+ " больше цифр в " + max);
		System.out.println("");
		System.out.println("");
	}
	
	/*
	 * Задача 15. Даны натуральные числа К и N. Написать метод(методы) 
	 * формирования массива А, элементами которого являются числа, сумма цифр 
	 * которых равна К и которые не большее N
	 */
	public static void run15() {
		int k;
		int n;
		
		int[] mas;
		
		k = 9;
		n = 80;
		
		mas = createArrKN(k, n);
		System.out.println("Задача 15");
		System.out.println("Два числа равны " + k + ", " + n);
		System.out.println("Ответ равен:");
		if (mas == null) {
			System.out.println("Числа k, n не могут быть отрицательными");
		} else {
			for (int i = 0; i < mas.length; i++) {
				System.out.print(mas[i] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	/*
	 * Метод возвращает массив чисел, сумма цифр которых равна К
	 * и которые не большее N
	 */
	public static int[] createArrKN(int k, int n) {
		int[] mas;
		int j = 0;
		
		if ((k < 1) || (n < 1)) {
			return null;
		}
		
		mas = new int[countNumber(k, n)];
		
		for (int i = 1; i < n; i++) {
			if (sumDigit(i) == k) {
				mas[j] = i;
				j++;
			}
		}
		return mas;
	}
	
	/*
	 * Метод возвращает количество чисел, сумма цифр которых равна К
	 * и которые не большее N
	 */
	public static int countNumber(int k, int n) {
		int count = 0;
		
		if ((k < 1) || (n < 1)) {
			return -1;
		}
		
		for (int i = 0; i <= n; i++) {
			if(sumDigit(i) == k) {
				count++;
			}
		}
		return count;
	}
	
	/*
	 * Метод используется в задачах 15, 17, 20. Возращает сумму цифр передаваемого 
	 * в метод числа
	 */
	public static int sumDigit(int a) {
		int sum = 0;
		while (a > 0) {
			sum = sum + a % 10;
			a = a / 10;
		}
		return sum;
		
	}
	
	/*
	 * Задача 16. Два простых числа называются «близнецами», 
	 * если они отличаются друг от друга на 2 (например, 41 и 43). Найти
	 * и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное 
	 * натуральное число больше 2. Для решения задачи использовать декомпозицию
	 */
	public static void run16() {
		int n;
		
		int[] mas;
		
		n = 5;
		
		mas = calcTwins(n);
		System.out.println("Задача 16");
		System.out.println("Числа близнецы на отрезке " + n + ", " 
				+ (2 * n) + " равны:");
		if (mas == null) {
			System.out.println("По условию n > 0");
		} else {
			for (int i = 0; i <= mas.length - 1; i = i + 2) {
				System.out.println(mas[i] + ", " + mas[i +1]);
			}
		}
		System.out.println("");
	}
	
	/*
	 * Метод возвращает массив чисел "близнецов"
	 */
	public static int[] calcTwins(int n) {
		int[] mas;
		
		if (n <= 2) {
			return null;
		}
		
		mas = new int[countTwins(n)];		
		mas[0] = n;
		mas[1] = mas[0] + 2;
		for (int i = 2; i < mas.length - 1; i = i + 2) {
			mas[i] = mas[i - 2] + 1;
			mas[i + 1] = mas[i] + 2;
		}
		return mas;
	}
	
	/*
	 * Метод возвращает количество чисел "близнецов"
	 */
	public static int countTwins(int n) {
		if (n <= 2) {
			return - 1;
		}
		return (2 * n - n - 1) * 2;
	}
	
	/*
	 * Задача 17.  Натуральное число, в записи которого n цифр, называется числом
	 * Армстронга, если сумма его цифр, возведенная в степень n, равна самому числу. 
	 * Найти все числа Армстронга от 1 до k. Для решения задачи использовать 
	 * декомпозицию
	 */
	public static void run17() {
		int k;
			
		int[] arm;		
		
		k = 200;
		
		arm = createArrArm(k);	
		
		System.out.println("Задача 17");
		System.out.println("Числа Армстронга на участке от 1 до " + k + " равны:");
		if (arm == null) {
			System.out.println("число k должно быть натуральным ");
		} else {
			for (int i = 0; i < arm.length; i++) {
				System.out.print(arm[i] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	/*
	 * Метод возврщает массив чисел Армстронга в заданном пределе
	 */
	public static int[] createArrArm(int k) {
		int j = 0; 		
		int[] arm;
		
		if (k < 1) {
			return null;
		}
		
		arm = new int[countNumArm(k)];
		
		for (int i = 1; i <= k; i++) {
			if (i == numA(i)) {
				arm[j] = i;
				j++;
			}
		}
		return  arm;
	}
	
	/*
	 * Метод возврщает количество чисел Армстронга в заданном пределе
	 */
	public static int countNumArm(int k) {
		int count = 0;
		
		if (k < 1) {
			return -1;
		}
		for (int i = 1; i <= k; i++) {
			if (i == numA(i)) {
				count++;
			}
		}
		return count;
	}
	
	/*
	 * Метод возвращает значение вычисления суммы цифр в степени указанного числа
	 */
	public static int numA(int a) {
		int sum = 0;
		int pow = countDigit(a);		// метод countDigit(a) написан в 15 задаче
										// стр. 709
		while (a > 0) {
			sum = sum + (int) Math.pow((a % 10), pow);
			a = a / 10;
		}
		return sum; 
	}
	
	/*
	 * Задача 18. Найти все натуральные n-значные числа, цифры в которых образуют
	 * строго возрастающую последовательность (например, 1234, 5789). Для решения
	 * задачи использовать декомпозицию
	 */

	public static void run18() {
		int n;
		int j = 0; 			// номер элемента массива
		
		int[] a; 			
		
		n = 4;
		
		a = new int[countRightN(n)];
		
		for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
			if (calcRightN(i)) {
				a[j] = i;
				j++;
			}
		}
		
		System.out.println("Задача 19");
		System.out.println("Натуральные числа " + n + " значности цифры "
				+ "в которых образуют строго возрастающую последовательность:");
		if (countRightN(n) == -1) {
			System.out.println("Количество цифр в числе не может быть отрицательным");
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
		System.out.println("");
		System.out.println("");
		
		
	}
	
	/*
	 * Метод возвращает количесво чисел указанной значности, цифры в которых образуют
	 * строго возрастающую последовательность
	 */
	public static int countRightN(int n) {
		int count = 0;
		
		if (n < 1) {
			return - 1;
		}
		
		for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
			if (calcRightN(i)) {
				count++;
			}
		}
		return count;
	}
	
	/*
	 * Метод возвращает является ли указанное число, цифры в котором образуют
	 * строго возрастающую последовательность
	 */
	public static boolean calcRightN(int a) {
		int j = a % 10;
		a = a / 10;
		
		while (a > 0) {
			if (j != (a % 10 + 1)) {
				return false;
			}
			j = a % 10;
			a = a / 10;
		}
		return true;
	}
	
	/*
	 * Задача 19. Написать программу, определяющую сумму n - значных чисел,
	 * содержащих только нечетные цифры. Определить также, сколько четных цифр 
	 * в найденной сумме. Для решения задачи использовать декомпозицию
	 */

	public static void run19() {
		int n;
		
		n = 1;
		
		System.out.println("Задача 19");
		if (sumUneven(n) == -1) {
			System.out.println("Число n должно быть натуральным");
		}
		System.out.println("Cумма " + n  + "- значных чисел, "
				+ "содержащих только нечетные цифры " + sumUneven(n));
		System.out.println("Количество четных цифр в сумме нечетных"
				+ " чисел равна " + countEvenD(sumUneven(n)));
		System.out.println("");
	}
	
	/*
	 * Метод возвращает сумму нечетных чисел указанной значности
	 */
	public static int sumUneven(int n) {
		int sum = 0;
		
		if (n < 1) {
			return - 1;
		}
		for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
			sum = sum + calcUneven(i);
		}
		return sum;
	}
	
	/*
	 * Метод возвращает заданное число, если все ее цифры нечетные, в противном 
	 * случае возвращает 0 
	 */
	public static int calcUneven(int a) {
		int b = a;
		int i;
		while (b > 0) {
			i = b % 10;
			if (i % 2 == 0) {
				return 0;
			}
			b = b / 10;
		}
		return a;
	}
	
	/*
	 * Метод возвращает количество четных цифр у заданного числа
	 */
	public static int countEvenD(int a) {
		int count = 0;
		int i;
		while (a > 0) {
			i = a % 10;
			if (i % 2 == 0) {
				count++;
			}
			a = a / 10;
		}
		return count;
	}
	
	
	/*
	 * Задача 20. Из заданного числа вычли сумму его цифр. Из результата вновь
	 * вычли сумму его цифр и т.д. Сколько таких действий надо произвести, чтобы 
	 * получился нуль? Для решения задачи использовать декомпозицию
	 */
	public static void run20() {
		int n;
		
		n = 21;
		
	System.out.println("Задача 20");
	System.out.println("Дано число n: " + n);
	if (calcToZero(n) == - 1) {
		System.out.println("Число n не может быть отрицательным");
	} else {
		System.out.println("Количество действий для получения из n: " + calcToZero(n));
	}
	System.out.println("");
	}
	
	/*
	 * Метод возвращает количество действий для получения из указанного число 0
	 */
	public static int calcToZero(int n) {
		int count = 0;
		
		if (n < 0) {
			return - 1;
		}
		
		while (n > 0) {
			n = n - sumDigit(n);	// метод написан в задаче 15 (стрю 709)
			count++;
		}
		return count;
	}
}
