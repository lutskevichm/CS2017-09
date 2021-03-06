package by.it.sc02_morning.patsko.lesson10;
/*
вспомогательный класс.
событие у аудитории(два поля: начало и конец)

Обратите внимание на метод compareTo
*/
class Item implements Comparable<Item> {
    int cost;
    int weight;

    Item(int cost, int weight) {
        this.cost = cost;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Item{" +
                "cost=" + cost +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Item o) {
        //тут может быть ваш компаратор
        if(this.cost/this.weight<o.cost/o.weight) return 1;
        else {
            if (this.cost/this.weight>o.cost/o.weight) return -1;
            else return 0;
        }
    }

}
