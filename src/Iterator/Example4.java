package Iterator;

import java.util.ArrayList;
import java.util.Collection;

public class Example4 {
	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<Integer>();
		for (int i = 0; i < 10; ++i)
			c.add(i);
		for (int i : c)
			System.out.print(i + " ");
		System.out.println();
		for (int i : c)
			if (i % 2 == 0)
				c.remove(i);
		for (int i : c)
			System.out.print(i + " ");
	}
}
//remove ������ �ȵȴ�.
//�÷��� ��ü�� for ������ Ž���ϴ� ���߿�, �� �÷��� ��ü�� �����Ǵ� �޼ҵ�(add, remove, addAll, clear ��)�� ȣ��Ǹ� ������ �߻��Ѵ�.
//�÷��� ��ü�� Ž���ϴ� ���߿�, ���ͷ����� ��ü�� remove �޼ҵ带 ȣ���ϴ� ���� ���ȴ�.